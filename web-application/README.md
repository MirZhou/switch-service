# Web应用程序所在包

## 1. 如何切换数据源？
* 在`data-api`中定义数据访问接口
* 在各数据源的访问接口实现模块中，实现其数据访问。如：`data-mysql`，适配MySQL数据库
* 在`./pom.xml`文件中，引入要使用的数据访问实现Jar包，即可完成数据源的切换。如
    ```xml
    <dependency>
        <groupId>cn.eros.data.mysql</groupId>
        <artifactId>data-mysql</artifactId>
        <version>1.0.0</version>
    </dependency>
    ```