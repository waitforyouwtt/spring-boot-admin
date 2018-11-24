####spring boot admin
spring boot admin 用于管理和监控一个或多个spring boot程序。

spring boot 1.5 以后，actuator 的所有API 接口默认开启了安全认证。

####查看效果：
1.启动eureka-server
2.启动eureka-client-one
4.启动admin-server
5.访问[http://localhost:5000](即看到效果)
6.可以点击details 查看各种信息[比如日志，指标，环境，jmx等]
---------------------------------------------------------------
####加入熔断器
1.启动eureka-server
2.启动eureka-client-one
4.启动admin-server
5.可以看到弹框[某个服务上线/下线了]
6.访问[http://localhost:5000](即看到效果)
7.可以点击details 查看各种信息[比如日志，指标，环境，jmx等]
8.访问[http://localhost:8762/hi?name=jie]

