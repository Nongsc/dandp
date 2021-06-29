package top.annoo.service;

import top.annoo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.HashMap;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 *
 * @author NongShiChao
 * @since 2021-06-29
 */
public interface UserService extends IService<User> {

    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return 用户数据和登录标识token
     */
    HashMap<String, Object> getByUserNameAndPassword(String username, String password);
}
