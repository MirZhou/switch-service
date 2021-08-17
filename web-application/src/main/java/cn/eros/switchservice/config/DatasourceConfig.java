package cn.eros.switchservice.config;

//import org.mybatis.spring.annotation.MapperScan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * <p>create time：2021-08-11 15:42
 *
 * @author Eros
 */
@Slf4j
@ComponentScan("${data.layer.base-packages}")
//@ComponentScan("cn.eros.data.api")
//@MapperScan("${data.layer.base-packages}")
@Configuration
public class DatasourceConfig {

    @Value("${data.layer.base-packages}")
    private String basePackage;

    @PostConstruct
    public void init() {
        log.info("package:{}", this.basePackage);
    }
}
