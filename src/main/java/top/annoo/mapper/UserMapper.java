package top.annoo.mapper;

import top.annoo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 系统用户 Mapper 接口
 * </p>
 *
 * @author NongShiChao
 * @since 2021-06-29
 */
public interface UserMapper extends BaseMapper<User> {
    User selectByUserNameAndPassword(String username, String password);
}
