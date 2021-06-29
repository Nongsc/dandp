package top.annoo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.annoo.mapper")
public class DandpApplication {

    public static void main(String[] args) {
        SpringApplication.run(DandpApplication.class, args);
    }

}
