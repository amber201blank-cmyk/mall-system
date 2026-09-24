# 美剧周边商城系统

## 项目简介

美剧周边商城是一套基于 Spring Boot + Vue 开发的前后端分离电商系统。

项目面向用户提供商品浏览、商品详情查看、购物车管理、订单创建、订单管理等功能，同时提供管理员对商品、订单等业务数据的管理能力。

前端采用 Vue 开发，通过 Axios 调用后端 RESTful API 与后端服务进行数据交互。

后端基于 Spring Boot 构建业务服务，使用 MyBatis 完成数据访问，Redis 实现高频业务数据存储，Spring Security 实现用户身份认证。


## 项目架构

项目采用前后端分离架构：


Vue
|
| Axios
|
RESTful API
|
Spring Boot
|
MyBatis
|
MySQL

Redis
|
缓存及业务数据存储


- 前端负责页面展示和用户交互
- 后端负责业务逻辑处理和数据管理
- MySQL 保存核心业务数据
- Redis 提供高效的数据访问能力


## 核心功能

### 用户模块

- 用户注册
- 用户登录
- 基于 Spring Security 实现身份认证
- 使用 SecurityContext 保存当前登录用户信息


### 商品模块

- 商品分类展示
- 商品列表查询
- 商品详情查看
- 商品分页查询


### 购物车模块

- 基于 Redis Hash 存储用户购物车数据
- 使用用户 ID 作为 Key
- 商品 ID 作为 Field
- 支持商品添加、修改数量、删除等操作


### 订单模块

- 用户提交订单
- 订单商品快照保存
- 订单状态流转
- 模拟支付流程
- 订单查询


### 管理模块

- 商品管理
- 分类管理
- 订单管理


## 技术栈

### 后端

- Java
- Spring Boot
- Spring Security
- MyBatis
- MySQL
- Redis
- Maven


### 前端

- Vue 2
- Vue Router
- Vuex
- Axios
- Vant
- Element UI
- Vue CLI


## 项目亮点

### 1. 基于 Spring Security 实现用户认证

用户登录成功后，将用户信息封装到 Authentication 中，并保存到 SecurityContextHolder。

后续业务接口通过 SecurityContext 获取当前登录用户 ID，避免依赖前端传递用户身份信息，提高接口安全性。


### 2. 使用 Redis Hash 实现购物车功能

购物车数据采用 Redis Hash 结构：


Key:
cart:{userId}

Field:
商品ID

Value:
商品数量及部分商品信息


相比 Redis String 存储整个购物车对象，Hash 结构能够更加方便地对单个商品进行查询、修改和删除。


### 3. MySQL 保存核心业务数据

Redis 主要用于提高访问效率，而商品、订单等核心数据最终以 MySQL 作为持久化存储。

创建订单时重新查询数据库确认商品信息，保证业务数据准确性。


### 4. 订单流程设计

订单创建过程中：

- 校验用户身份
- 校验商品库存
- 创建订单
- 保存订单商品快照
- 更新订单状态

订单与订单商品通过订单 ID 形成关联。


## 项目目录


mall
│
├── backend # Spring Boot 后端项目
│
└── frontend # Vue 前端项目



## 本地运行


## 后端启动

### 环境要求

- JDK 8+
- MySQL
- Redis
- Maven


### 启动步骤

1. 创建 MySQL 数据库

2. 执行数据库初始化 SQL

3. 修改配置文件：


backend/src/main/resources/application.yml


配置：

- MySQL 数据库连接
- Redis 地址及密码


4. 启动 Spring Boot 项目


默认访问：


http://localhost:8080



## 前端启动

### 环境要求

- Node.js
- npm


进入前端目录：

```bash
cd frontend

安装依赖：

npm install

启动：

npm run serve

默认访问：

http://localhost:8081
```