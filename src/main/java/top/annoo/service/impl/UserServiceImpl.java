package top.annoo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.annoo.entity.User;
import top.annoo.mapper.UserMapper;
import top.annoo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.annoo.util.JwtUtil;
import top.annoo.vo.ReturnResVO;

import java.util.HashMap;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author NongShiChao
 * @since 2021-06-29
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public HashMap<String, Object> getByUserNameAndPassword(String username, String password) {
        HashMap<String, Object> data = new HashMap<>();
        //将密码进行加密比对
        password = DigestUtils.md5Hex(password);
        // 通过用户名和密码进行查询
        User user = userMapper.selectByUserNameAndPassword(username, password);
        if (user != null && "".equals(user)) {
            data.put("token", JwtUtil.generateToken(username));
            data.put("userInfo", user);
            return data;
        }
        return null;
    }
}
