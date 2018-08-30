package demo;

/**
 * 具体调停者(ConcreteMediator)角色
 * @author: songdewei
 * @date: 2018/8/30
 */
public class ConcreteMediator implements Mediator{
    //持有并维护同事A
    private ConcreteColleague concreteColleague;

    public void setConcreteColleague(ConcreteColleague concreteColleague) {
        this.concreteColleague = concreteColleague;
    }


    @Override
    public void changed(Colleague c) {
        /**
         * 某一个同事类发生了变化，通常需要与其他同事交互
         * 具体协调相应的同事对象来实现协作行为
         */

    }
}
