
## 注解
使用时，需在xml中配置
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:component-scan base-package="com.gzh"/>
    <context:annotation-config/>
    
</beans>
```
- @Autowired：自动装配，通过byType方式实现，如果不能唯一自动装配，则通过`@Qualifier(value="xxx"")`
- @Nullable：字段标记了这个注解，说明这个字段可以为null
- @Resource：默认通过byName方式实现，如果找不到，则通过byType实现
- @Component：组件。用在类上，等价于在xml中添加`<bean id="xx" class="xx.xx"/>`。但需在xml中配置`<context:component-scan base-package="com.gzh.entity"/>`
- @Value：用在属性或set方法上，为属性设置值。
- @Component衍生的注解
  - @Repository：用在dao层的类上
  - @Service：用在service层的类上
  - @Controller：用在controller层的类上
- @Scope：作用域，`@Scope("singleton")`为单例模式、`@Scope("prototype")`为原型模式
- @Configuration：配置。相当于一个xml文件
- @ComponentScan：包扫描。`@ComponentScan("com.gzh.entity")`
- @Import：引入另一个配置。`@Import(GzhConfig2.class)`
- @Aspect：用在类上，标注这个类是一个切面
- @Before：执行前
- @After：执行后
- @Around：环绕
- @Controller：controller
  - @RestController：相当于`@Controller`+`@ResponseBody`
- @ResponseBody：返回字符串，不走视图解析器
- @RequestMapping：设置访问路径
  - @GetMapping：get请求的访问路径
  - @PostMapping：post请求的访问路径
  - @PutMapping：put请求的访问路径
  - @DeleteMapping：delete请求的访问路径
- @RequestParam：请求参数
- @PathVariable：请求路径参数
- @RequestBody @Validated：通常组合使用，用来验证实体类字段
