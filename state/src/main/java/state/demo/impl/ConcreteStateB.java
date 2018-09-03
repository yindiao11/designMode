package state.demo.impl;

import state.demo.State;

/**
 * @author: songdewei
 * @date: 2018/9/3
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(String sampleParameter) {

        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }
}
