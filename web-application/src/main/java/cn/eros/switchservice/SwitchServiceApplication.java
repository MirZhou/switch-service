package cn.eros.switchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Eros
 */
@SpringBootApplication
public class SwitchServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwitchServiceApplication.class, args);
    }
}
