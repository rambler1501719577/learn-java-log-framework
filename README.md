# Java常用日志库整理
几个核心概念，总是混淆，特此整理

`log4j`、 `log4j2`、 `logback`、 `slf4j`、`commons-logging`、`slf4j-api`及`log4j-slf4j2-impl`

这些库经常看到， 实际选日志库时又迷茫了，分别讲解以上这些库



以上这些库可以分成三类

第一类是日志门面类，可以理解为接口层，使用时只需要使用接口，具体实现由特定实现类实现，常见日志如`slf4j`和`commons-logging`，上面的`slf4j-api`就是slf4j的依赖库

第二类是具体的日志框架， 如`log4j`和`log4j2`分别指log4j两代版本，logback是另一种日志实现

第三类是桥梁，如slf4j和log4j2结合就需要一个`log4j2-slf4j-impl`依赖



> 还有一些类似log4j-api的一般是作为门面使用， 比如单独使用log4j，就需要引入`log4j-api`和`log4j-core`，其实仔细想想这样是合理的， 将实现放在log4j-core中， 这样在和slf4j对接的时候分层更明确一些，`log4j-core`只考虑实现，上层门面可以用自己的`log4j-api`， 也可以使用`slf4j-api`