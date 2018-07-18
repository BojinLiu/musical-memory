----04-13----
1.Maven的pom文件中出现 <scope>test</scope> ：
    scope的默认值是compile 表示项目的编译需要当前的依赖 包括测试、运行。
    test 代表依赖只参与测试工作 包括测试代码的编译和执行，比如Junit。
    runtime 表示依赖不用参加编译，但是后续的运行，测试需要用到，比如jdbc mysql的驱动。
    provided 表示web容器中提供了这个依赖，只是在编译测试阶段，我们需要这个artifact对应的jar包在classpath中。

2.ContextLoaderListener 上下文监听器：
    监听器是一个实现特定接口的普通java程序，这个程序专门用于监听另一个java对象的方法调用或属性改变，
    当被监听对象发生上述事件后，监听器某个方法将立即执行。
----04-14----
1.velocity在spring中的配置：
    spring在spring-web的jar包中有velocityConfig的Bean，但是类似于ResourceLoadPath这些属性都是存在于VelocityEngineFactory中，
    但是这个类却在spring-context-support中！
----04-16----
1.velocity渲染后出现乱码：
    在vm文件被velocityEngine渲染之后，出现乱码， 修改xml中的velocityConfig里边的velocityProperty input.encoding=UTF-8。
