package visitor.impl;

import visitor.Node;
import visitor.Visitor;

/**
 * 具体节点(ConcreteNode)角色
 * @author: songdewei
 * @date: 2018/9/3
 */
public class NodeB extends Node {
    /**
     * 接受方法
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    /**
     * NodeB特有的方法
     */
    public String operationB(){
        return "NodeB";
    }
}
