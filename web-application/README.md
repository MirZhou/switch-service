# Web应用程序所在包

## 1. 如何切换数据源？
* 在`data-api`中定义数据访问接口
* 在各数据源的访问接口实现模块中，实现其数据访问。如：`data-mysql`，适配MySQL数据库
* 在`./pom.xml`文件中，引入要使用的数据访问实现Jar包。如
    ```xml
    <dependency>
        <groupId>cn.eros.data.api.mysql</groupId>
        <artifactId>data-mysql</artifactId>
        <version>1.0.0</version>
    </dependency>
    ```
* 在`*.properties`文件中，写入相关数据库配置。如`application-mysql.properties`：
    ```properties
    # MySQL configuration
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.url=jdbc:mysql://localhost:3306/db_test?autoReconnect=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Asia/Shanghai&useSSL=false
    spring.datasource.username=root
    spring.datasource.password=123456
    
    mybatis.configuration.map-underscore-to-camel-case=true
    mybatis.type-aliases-package=cn.eros.data.domain
    mybatis.mapper-locations=classpath:mybatis-mapper/*Mapper.xml
    ```