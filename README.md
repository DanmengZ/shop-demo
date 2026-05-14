# shop-demo

一个基于 Spring Boot 的简单商品查询示例项目，使用 MyBatis 访问 MySQL 数据库，并提供商品列表接口。

## 技术栈

- Java 17
- Spring Boot 4.0.6
- Spring Web MVC
- MyBatis Spring Boot Starter
- MySQL
- Maven Wrapper

## 项目结构

```text
src/main/java/com/example/shop
├── ShopDemoApplication.java      # 启动类
├── controller/ProductController.java
├── service/ProductService.java
├── mapper/ProductMapper.java
└── entity/Product.java
```

## 数据库配置

配置文件位置：

```text
src/main/resources/application.properties
```

当前数据库连接配置：

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/shop_demo?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai
spring.datasource.username=root
spring.datasource.password=qaz12345
server.port=8080
```

运行前需要先创建数据库和商品表：

```sql
CREATE DATABASE IF NOT EXISTS shop_demo DEFAULT CHARACTER SET utf8mb4;

USE shop_demo;

CREATE TABLE IF NOT EXISTS product (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    stock INT NOT NULL
);

INSERT INTO product (name, price, stock) VALUES
('iPhone', 5999.00, 10),
('Keyboard', 199.00, 50),
('Mouse', 99.00, 80);
```

## 运行项目

Windows PowerShell：

```powershell
.\mvnw.cmd spring-boot:run
```

如果出现 `powershell is not recognized`，可以先执行：

```powershell
$env:PATH = "C:\WINDOWS\System32\WindowsPowerShell\v1.0;$env:PATH"
.\mvnw.cmd spring-boot:run
```

## 接口

商品列表：

```text
GET http://localhost:8080/product/list
```

返回示例：

```json
[
  {
    "id": 1,
    "name": "iPhone",
    "price": 5999.00,
    "stock": 10
  }
]
```
