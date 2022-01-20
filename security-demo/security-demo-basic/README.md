## security-demo-basic
这个 demo 是基于 spring-security `WebSecurityConfigurerAdapter` 的父类来实现, 你可以来实现以下些功能:
* 基于 `UserDetails` 接口，来实现 spring-security 的用户管理.
* 基于 `PasswordEncoder` 接口， 来实现自定密码加密和凭证(credentials)。官方推荐许多加密算法， 推荐使用 `BCryptPasswordEncoder`.
* 基于 `UserDetailsService` 来实现用户信息的管理，通常有以下几种方式：
    * `InMemoryUserDetailsManager` 基于内存的用户管理， 所有用户信认证信息存储内存
    *  `JdbcUserDetailsManager` 基于数据库的用户管理，需要数据库支持
    *  `CachingUserDetailsService` 基于缓存的用户管理，需要缓存支持，比如redis
* 基于用户角色的认证
* 基于用户权限的认证
* 基于客户端 IP 的认证
* 可以实现自定义登录成功处理器的逻辑
* 可以实现自定义登录失败处理器的逻辑
* 实现 `HTTPCode： 403 ` 的页面定义
* 实现 `remember me` 功能， 需要数据库支持， 可以可以基于内存
* CRSF(Cross-site Request Forgery) 跨站请求伪造。也被称为是 `OneClick Attack` 或者 `Session Riding` 通过伪造用户请求访问受信任的站点
  的非法请求， spring-security 默认开启
* 基于注解 `@PreAuthorize` 实现认证