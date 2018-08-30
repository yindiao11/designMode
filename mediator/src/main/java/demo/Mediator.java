package demo;

/**
 * 抽象调停者(Mediator)角色
 * @author: songdewei
 * @date: 2018/8/30
 */
public interface Mediator {
    /**
     * 同事对象在自身改变的时候来通知调停者方法
     * 让调停者负责相应的与其他同事对象的交互
     */
    public void changed(Colleague c);
}
