package adaptor;

/**
 * 对象适配器：基于组合
 *
 * @author: songdewei
 * @date: 2020/3/22
 */


public class Adaptor1 implements ITarget {
    private Adaptee adaptee;

    public Adaptor1(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void f1() {
        adaptee.fa();
        //委托给Adaptee
    }

    public void f2() {
        //...重新实现f2()...
    }

    public void fc() {
        adaptee.fc();
    }
}