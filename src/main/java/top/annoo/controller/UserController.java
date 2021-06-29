package top.annoo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import top.annoo.service.UserService;
import top.annoo.vo.ReturnResVO;

import java.util.HashMap;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author NongShiChao
 * @since 2021-06-29
 */
@RestController
@RequestMapping("/adminApi")
@CrossOrigin(origins = "http://localhost:8081")//开启跨域访问
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return 用户信息以及登录token
     */
    @PostMapping("common/login")
    public ReturnResVO commonLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        HashMap<String, Object> data = userService.getByUserNameAndPassword(username, password);
        return data == null ? ReturnResVO.fail("登录失败，用户名或密码输入错误") : ReturnResVO.success("登录成功", data);
    }

    /**
     * 根据token 获取用户信息
     *
     * @return
     */
    @GetMapping("common/userinfo")
    public ReturnResVO commonUserInfo() {

        return null;
    }
}

