package visitor.impl;

import visitor.Visitor;

/**
 * 具体访问者(ConcreteVisitor)角色
 * @author: songdewei
 * @date: 2018/9/3
 */
public class VisitorA implements Visitor {

    /**
     * 对应于NodeA的访问操作
     */
    @Override
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }
    /**
     * 对应于NodeB的访问操作
     */
    @Override
    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }
}
