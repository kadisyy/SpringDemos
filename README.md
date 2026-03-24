# SpringDemos

> **这个工程有什么用？** / What is this project for?

SpringDemos 是一个基于 **Spring Framework** 的学习示例工程，通过可运行的代码演示 Spring 核心机制，帮助开发者深入理解 Spring IoC 容器、AOP、Bean 生命周期等底层原理。

SpringDemos is a hands-on learning project that demonstrates core **Spring Framework** internals through runnable examples, helping developers understand the IoC container, AOP, bean lifecycle, and more.

---

## 工程结构 / Project Structure

```
spring_demo/
└── src/main/java/com/ckwyy/
    ├── bean/          # Bean 注册方式与生命周期 / Bean registration & lifecycle
    │   ├── processor/ # Bean 处理器 / Bean post-processors
    │   ├── scan/      # 组件扫描 / Component scanning
    │   └── value/     # 属性注入 / Property injection (@Value)
    ├── aop/           # 面向切面编程 / Aspect-Oriented Programming (AOP)
    ├── aware/         # Spring Aware 接口 / Spring Aware interfaces
    ├── condition/     # 条件装配 / Conditional bean registration
    ├── config/        # 配置类 / Java-based configuration (@Configuration)
    └── selector/      # 自定义 Import 机制 / Custom import selectors
```

---

## 涵盖知识点 / Topics Covered

| 包 / Package | 演示内容 / Demonstrates |
|---|---|
| `bean` | `@Bean`, `@Component`, `FactoryBean`, 单例/原型作用域, 懒加载 |
| `bean.processor` | `BeanPostProcessor`, `BeanFactoryPostProcessor`, `InstantiationAwareBeanPostProcessor` |
| `bean.scan` | `@ComponentScan`, 自定义 `TypeFilter` |
| `bean.value` | `@Value` 属性注入 |
| `aop` | `@Aspect`, `@Before`, `@After`, `@AfterReturning`, `@AfterThrowing`, `@Pointcut` |
| `aware` | `BeanNameAware`, `BeanFactoryAware` 等 Aware 接口 |
| `condition` | `@Conditional`，基于操作系统的条件化 Bean 注册 |
| `config` | `@Configuration`, `@Import`, `@Lazy`, `@Scope` |
| `selector` | `ImportSelector`, `ImportBeanDefinitionRegistrar` |

---

## 技术栈 / Tech Stack

- **Spring Framework** (Core / Context / AOP / AspectJ)
- **Java** (Annotations, Reflection)
- **Maven** — 构建工具 / build tool
- **JUnit 4** — 单元测试 / unit testing
- **FastJSON 1.2.72** — JSON 序列化 / JSON serialization

---

## 快速开始 / Getting Started

### 前置要求 / Prerequisites

- JDK 8+
- Maven 3.x

### 构建 / Build

```bash
mvn clean compile
```

### 运行 / Run

本工程不含 Web 服务器，通过直接运行 `main` 方法来演示各功能：

This project has no embedded web server. Run the `main` methods directly to see each feature in action:

```bash
# 示例：运行 Bean 注册演示
# Example: run bean registration demo
mvn exec:java -Dexec.mainClass="com.ckwyy.bean.Main"
```

### 测试 / Test

```bash
mvn test
```

---

## 适合人群 / Who Is This For?

- 想深入理解 Spring IoC 容器工作原理的 Java 开发者
- 正在学习 Spring AOP、Bean 生命周期、条件装配等核心特性的初中级开发者
- Java developers who want to understand how the Spring IoC container works under the hood
- Beginner-to-intermediate developers studying Spring AOP, bean lifecycle, and conditional configuration
