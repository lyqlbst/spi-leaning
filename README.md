# spi-leaning
了解spi是什么，一个简单的demo和描述

* 什么是SPI
  > SPI 全称为 (Service Provider Interface) ,是JDK内置的一种服务提供发现机制。 
  很多优秀的框架都提供了这种高扩展的方式（dubbo、Spring、apache-log、jdbc等）。
* 规则
  > 首先我们需要一个目录：src/META-INF/services，然后在里面定义一个文件，名称是想要扩展的接口相对于/src的路径，
  例如在本例中的```Hello```的路径为：```priv.hello.spi.Hello```，
  则定义的文件名就是```priv.hello.spi.Hello```。
  
  > 在文件中定义实现该方法的实现类的路径名，例如：```priv.hello.spi.impl.EnHelloImpl```，可定义多个，每行一个。
  
  > 然后就可以在主类中通过```ServiceLoader<Hello> loaders = ServiceLoader.load(Hello.class);```
  获取到所有的实现类并调用实现方法。
* 好处
  > 面向接口编程，做到接口和实现的分离，体现抽象的重要方式，实现可插拔。
  > 高扩展，当框架或jar包的代码不能满足需求时，可以做到通过spi去扩展，而不是去修改源码。
