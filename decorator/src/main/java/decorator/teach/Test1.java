package decorator.teach;

import org.junit.Test;

/**
 * @author: songdewei
 * @date: 2020/6/22
 */
public class Test1 {
    @Test
    public void test(){
        Component component = new ConcreteComponent();
        component.sampleOperation();
    }

    @Test
    public void testDecoratorA(){
        Component component = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
        ConcreteDecoratorA concreteDecoratorA1 = new ConcreteDecoratorA(concreteDecoratorA);

        concreteDecoratorA1.sampleOperation();
    }
}
