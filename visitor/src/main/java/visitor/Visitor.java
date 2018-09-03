package visitor;

import visitor.impl.NodeA;
import visitor.impl.NodeB;

/**
 * 抽象访问者角色
 * @author: songdewei
 * @date: 2018/9/3
 */
public interface Visitor {
    /**
     * 对应于NodeA的访问操作
     */
    public void visit(NodeA node);
    /**
     * 对应于NodeB的访问操作
     */
    public void visit(NodeB node);
}
