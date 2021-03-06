　　访问者模式适用于数据结构相对未定的系统，它把数据结构和作用于结构上的操作之间的耦合解脱开，使得操作集合可以相对自由地演化。访问者模式的简略图如下所示：



　　数据结构的每一个节点都可以接受一个访问者的调用，此节点向访问者对象传入节点对象，而访问者对象则反过来执行节点对象的操作。这样的过程叫做“双重分派”。节点调用访问者，将它自己传入，访问者则将某算法针对此节点执行。访问者模式的示意性类图如下所示：

　　

　　访问者模式涉及到的角色如下：

　　●　　抽象访问者(Visitor)角色：声明了一个或者多个方法操作，形成所有的具体访问者角色必须实现的接口。

　　●　　具体访问者(ConcreteVisitor)角色：实现抽象访问者所声明的接口，也就是抽象访问者所声明的各个访问操作。

　　●　　抽象节点(Node)角色：声明一个接受操作，接受一个访问者对象作为一个参数。

　　●　　具体节点(ConcreteNode)角色：实现了抽象节点所规定的接受操作。

　　●　　结构对象(ObjectStructure)角色：有如下的责任，可以遍历结构中的所有元素；如果需要，提供一个高层次的接口让访问者对象可以访问每一个元素；如果需要，可以设计成一个复合对象或者一个聚集，如List或Set。