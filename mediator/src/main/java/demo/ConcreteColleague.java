package demo;

/**
 * 具体同事类(ConcreteColleague)角色
 * @author: songdewei
 * @date: 2018/8/30
 */
public class ConcreteColleague extends Colleague{

    /**
     * 构造函数
     *
     * @param mediator
     */
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    public void operation(){
        getMediator().changed(this);
    }

}
