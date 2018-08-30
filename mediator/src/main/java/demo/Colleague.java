package demo;

/**
 * 抽象同事类(Colleague)角色
 * @author: songdewei
 * @date: 2018/8/30
 */
public abstract class Colleague {
    //持有一个调停者
    private Mediator mediator;

    /**
     * 构造函数
     * @param mediator
     */
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    /**
     * 获取调停者
     * @return
     */
    public Mediator getMediator() {
        return mediator;
    }
}
