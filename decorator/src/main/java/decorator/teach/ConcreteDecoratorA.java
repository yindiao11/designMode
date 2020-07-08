package decorator.teach;

/**
 * @author: songdewei
 * @date: 2020/6/22
 */
public class ConcreteDecoratorA extends Decorator {


    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        //业务代码
        System.out.println("增加装饰1。。。");
    }
}
