# 美剧周边商城系统（Frontend）

## 项目简介

本项目是美剧周边商城系统的前端部分，基于 Vue 开发。

项目采用前后端分离架构，通过 Axios 调用后端 Spring Boot 提供的 RESTful API，实现用户登录、商品浏览、商品详情查看、购物车管理、订单管理等功能。

---

## 技术栈

### 前端框架

- Vue 2
- Vue Router
- Vuex
- Vue CLI


### UI 与工具

- Axios
- Vant
- Element UI
- Sass

---

## 实现功能

### 用户模块

- 用户登录
- 用户信息展示
- 登录状态管理


### 商品模块

- 商品列表展示
- 商品分类展示
- 商品详情查看


### 购物车模块

- 添加商品到购物车
- 修改商品数量
- 删除购物车商品
- 查看购物车列表


### 订单模块

- 创建订单
- 查看订单列表
- 查看订单详情

---

## 项目结构


frontend
│
├── public # 静态资源
│
├── src
│ │
│ ├── api # 后端接口请求封装
│ │
│ ├── assets # 图片、样式等静态资源
│ │
│ ├── components # 公共组件
│ │
│ ├── router # Vue 路由配置
│ │
│ ├── store # Vuex 状态管理
│ │
│ ├── views # 页面组件
│ │
│ └── App.vue # 根组件
│
├── package.json # 项目依赖配置
└── vue.config.js # Vue 项目配置

---

## 本地运行

### 环境要求

需要提前安装：

- Node.js
- npm


### 安装依赖

进入前端目录：

```bash
cd frontend

执行：

npm install
启动开发环境

执行：

npm run serve

启动成功后访问：

http://localhost:8081
项目构建

生产环境打包：

npm run build
代码检查

执行：

npm run lint
```