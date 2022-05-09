# Spring Cloud

## 配置中心

### 新建项目 `serve-config`

配置中心服务

所需依赖

> spring cloud config server 配置中心服务端

```xml

<dependencies>
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-config-server</artifactId>
    </dependency>
</dependencies>
```

* 修改配置文件

```yaml
server:
  port: 8000

spring:
  application:
    name: SERVE-CONFIG
  profiles:
    #启用本地配置文件
    active: native
  cloud:
    config:
      server:
        native:
          #配置文件扫描目录
          search-locations: classpath:/config/
```

* 入口类添加注解 `@EnableConfigServer`

## 注册中心

* 新建项目 `serve-register`

注册中心服务

* 添加依赖

> eureka 注册中心服务端

```xml

<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
```

* 入口类添加注解 `@EnableEurekaServer`

### 配置配置中心

* 添加依赖

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
</dependency>
```

* 配置文件配置

```yaml
spring:
  config:
    # 配置中心地址
    import: optional:server-config:http://localhost:8000
  cloud:
    config:
      # 配置中心的 注册中心配置文件的文件名
      name: serve-registry
```

* 配置中心修改

配置中心 `config` 文件夹下添加文件 `serve-registry.yml`

```yaml
server:
  port: 8001

spring:
  application:
    name: SERVE-REGISTER

# Eureka相关配置
eureka:
  client:
    register-with-eureka: false # 是否注册自己的信息到注册中心
    fetch-registry: false # 是否拉取其他服务的信息
    serviceUrl: # 注册中心地址，集群的话为多个
      defaultZone: http://localhost:${server.port}/eureka/
```

## 网关





## 执行顺序


---

线程池

为什么使用线程池？

1. 复用已创建的线程（创建/销毁线程需要消耗系统资源）

1. 控制并发量（并发量过多会导致过多的资源消耗，从而造成服务器崩溃。**主要原因**）
2. 对线程统一管理

原理


