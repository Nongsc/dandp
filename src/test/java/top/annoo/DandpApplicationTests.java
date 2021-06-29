package top.annoo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.annoo.entity.TUser;
import top.annoo.mapper.TUserMapper;

@SpringBootTest
class DandpApplicationTests {
    @Autowired
    private TUserMapper userMapper;

    @Test
    void contextLoads() {
        TUser tUser = userMapper.selectById(44);
        System.out.println(tUser);
    }

}
