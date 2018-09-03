package state;

import state.demo.Context;
import state.demo.State;
import state.demo.impl.ConcreteStateB;

/**
 * @author: songdewei
 * @date: 2018/9/3
 */
public class ClientDemo {
    public static void main(String[] args){
        //创建状态
        State state = new ConcreteStateB();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
    }
}
