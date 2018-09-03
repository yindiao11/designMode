package visitor;

/**
 * 抽象节点(Node)角色
 * @author: songdewei
 * @date: 2018/9/3
 */
public abstract class Node {
    /**
     * 接受操作
     */
    public abstract void accept(Visitor visitor);
}
