### 消费者

spring-mvc-dubbo
	spring-mvc-consumer
	spring-mvc-interface
	spring-mvc-provider


当运行消费者系统会提示端口被占的提示，如下：

    ERROR [com.alibaba.dubbo.qos.server.Server] -  [DUBBO] qos-server can not bind localhost:22222, dubbo version: 2.6.6, current host: 10.236.67.170
	java.net.BindException: Address already in use: bind



qos中的一些Dubbo 内建的telnet命令的使用方法。
Qos=Quality of Service，qos是Dubbo的在线运维命令，可以对服务进行动态的配置、控制及查询，Dubboo2.5.8新版本重构了telnet（telnet是从Dubbo2.0.5开始支持的）模块，提供了新的telnet命令支持，新版本的telnet端口与dubbo协议的端口是不同的端口，默认为22222，可以通过配置文件dubbo.properties修改。telnet 模块现在同时支持 http 协议和 telnet 协议，方便各种情况的使用。

QoS提供了一些启动参数，来对启动进行配置，他们主要包括：

- qosEnable	是否启动QoS	true
- qosPort	启动QoS绑定的端口	22222
- qosAcceptForeignIp	是否允许远程访问	false


> 注意，从2.6.4/2.7.0开始，qosAcceptForeignIp默认配置改为false（拒绝远端主机发出的命令，只允许服务本机执行），如果qosAcceptForeignIp设置为true，有可能带来安全风险，请仔细评估后再打开。


解决方法：

    <dubbo:application name="spring-mvc-consumer">
		<dubbo:parameter key="qos.enable" value="true" />
		<dubbo:parameter key="qos.accept.foreign.ip" value="false" />
		<dubbo:parameter key="qos.port" value="33333" />
	</dubbo:application>
	
	

https://blog.csdn.net/u012988901/article/details/84503672