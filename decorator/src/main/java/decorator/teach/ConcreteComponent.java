package decorator.teach;

/**
 * 具体构件(ConcreteComponent)角色：
 * 定义一个将要接收附加责任的类。
 * @author: songdewei
 * @date: 2020/6/22
 */
public class ConcreteComponent implements Component{
    @Override
    public void sampleOperation() {
        //业务代码
        System.out.println("开始执行具体业务。。。");
    }
}
