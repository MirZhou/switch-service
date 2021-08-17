package cn.eros.data.api.mysql.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>create time：2021-08-13 09:22
 *
 * @author Eros
 */
@MapperScan("cn.eros.data.api.mysql.dao")
@Configuration
public class MySqlConfiguration {
}
