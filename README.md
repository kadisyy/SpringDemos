# SpringDemos

> **这个工程有什么用？** —— 本项目是一个 Spring Framework 核心知识点的学习与演示工程，通过可运行的示例帮助开发者系统掌握 Spring 的 IoC/DI、Bean 生命周期、AOP 等核心特性。

## 项目简介

**SpringDemos** 是一个基于 Java 的 Spring Framework 学习示例工程。它以最小化、可独立运行的代码片段形式，演示 Spring 容器的核心功能，适合初学者系统入门，也适合有经验的开发者查阅参考。

| 属性 | 值 |
|------|-----|
| 语言 | Java |
| 构建工具 | Maven |
| 核心框架 | Spring Framework（IoC、AOP） |
| 测试框架 | JUnit 4 |

---

## 目录结构

```
SpringDemos/
├── pom.xml                          # Maven 构建配置
└── src/
    ├── main/
    │   ├── java/com/ckwyy/
    │   │   ├── aop/                 # AOP 切面编程示例
    │   │   ├── aware/               # Spring Aware 接口示例
    │   │   ├── bean/                # Bean 及其相关扩展
    │   │   │   ├── processor/       # BeanPostProcessor 系列
    │   │   │   ├── scan/            # 组件扫描示例
    │   │   │   └── value/           # 属性注入示例
    │   │   ├── condition/           # 条件注册 Bean 示例
    │   │   ├── config/              # Java 注解配置类
    │   │   └── selector/            # ImportSelector 示例
    │   └── resources/
    │       ├── beans.xml            # XML 方式的 Spring 配置
    │       └── value.properties     # 外部化属性配置文件
    └── test/
        └── java/com/ckwyy/
            └── SpringTest.java      # JUnit 测试入口
```

---

## 涵盖的知识点

### 1. IoC 容器与 Bean 注册

| 特性 | 说明 |
|------|------|
| XML 配置 | 传统 `beans.xml` 配置方式 |
| Java 注解配置 | `@Configuration` + `@Bean` |
| 组件扫描 | `@ComponentScan`，支持自定义过滤器 |
| 自定义类型过滤器 | 实现 `TypeFilter` 接口 |

### 2. Bean 作用域与生命周期

| 特性 | 示例类 | 说明 |
|------|--------|------|
| 单例 / 原型作用域 | `MainConfig2` | `@Scope("singleton"/"prototype")` |
| 懒加载 | `MainConfig2` | `@Lazy` |
| initMethod / destroyMethod | `MainConfigOfLifeCycle`, `Car` | `@Bean(initMethod=..., destroyMethod=...)` |
| InitializingBean / DisposableBean | `Cat` | 接口方式生命周期回调 |
| @PostConstruct / @PreDestroy | `Dog`, `Apple` | JSR-250 注解方式 |

### 3. 依赖注入与属性赋值

| 特性 | 示例类 | 说明 |
|------|--------|------|
| 字面量注入 | `Room` | `@Value("北京")` |
| SpEL 表达式 | `Room` | `@Value("#{23-12}")` |
| 外部属性文件 | `Room`, `MainConfigPropertyValues` | `@PropertySource` + `@Value("${key}")` |

### 4. 条件化注册

- `@Conditional` 注解，配合自定义 `Condition` 实现
- `WindowsCondition` / `LinuxCondition`：根据操作系统环境动态决定是否注册 Bean

### 5. Bean 导入机制

| 机制 | 示例类 | 说明 |
|------|--------|------|
| `@Import` | `MainConfig2` | 直接导入配置类 |
| `ImportSelector` | `MySelector` | 以编程方式返回要导入的类名 |
| `ImportBeanDefinitionRegistrar` | `MyImportBeanDefinitionRegister` | 手动向容器注册 `BeanDefinition` |
| `FactoryBean` | `ColorFactoryBean` | 工厂模式创建 Bean |

### 6. Aware 接口

`AwareGo` 类同时实现了 `ApplicationContextAware` 和 `BeanNameAware`，演示 Bean 在初始化期间如何感知容器信息。

### 7. Bean 后置处理器

| 处理器 | 说明 |
|--------|------|
| `BeanPostProcessor` | 在 Bean 初始化前后插入逻辑 |
| `BeanFactoryPostProcessor` | 在容器启动时修改 Bean 定义 |
| `InstantiationAwareBeanPostProcessor` | 控制 Bean 实例化前后的行为 |
| `DestructionAwareBeanPostProcessor` | 在 Bean 销毁前插入逻辑 |

### 8. AOP 切面编程

- 通过 `@EnableAspectJAutoProxy` 启用 AspectJ 自动代理
- `LogAspect` 切面演示 `@Before`、`@After`、`@AfterReturning`、`@AfterThrowing` 四类通知
- 目标类 `Comput` 提供 `div()` 方法作为切入点

---

## 快速开始

### 环境要求

- JDK 8+
- Maven 3.5+

### 构建与运行测试

```bash
# 克隆仓库
git clone https://github.com/kadisyy/SpringDemos.git
cd SpringDemos

# 编译并执行测试
mvn test
```

### 运行示例

各功能模块的用法均有对应的 JUnit 测试方法覆盖，运行 `SpringTest.java` 即可观察 Spring 容器的行为输出。

---

## 许可证

本项目仅供学习交流使用。
