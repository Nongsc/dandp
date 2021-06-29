package top.annoo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.annoo.entity.User;
import top.annoo.mapper.UserMapper;

@SpringBootTest
class DandpApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
//        User user = userMapper.selectById(44);
//        System.out.println(user);
//        User user = userMapper.selectByUserNameAndPassword("root", "e10adc3949ba59abbe56e057f20f883e");
//        System.out.println(user);
    }

}
