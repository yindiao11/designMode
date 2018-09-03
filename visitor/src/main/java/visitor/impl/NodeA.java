package visitor.impl;

import visitor.Node;
import visitor.Visitor;

/**具体节点(ConcreteNode)角色
 * @author: songdewei
 * @date: 2018/9/3
 */
public class NodeA extends Node {
    /**
     * 接受操作
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    /**
     * NodeA特有的方法
     */
    public String operationA(){
        return "NodeA";
    }
}
