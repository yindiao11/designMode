package composite.teach2;

/**
 * @author: songdewei
 * @date: 2020/6/22
 */
public class Client1 {

    public static void main(String[]args){
        Component1 root = new Composite1("服装");
        Component1 c1 = new Composite1("男装");
        Component1 c2 = new Composite1("女装");

        //不用区分树枝和叶子节点
        Component1 leaf1 = new Leaf1("衬衫");
        Component1 leaf2 = new Leaf1("夹克");
        Component1 leaf3 = new Leaf1("裙子");
        Component1 leaf4 = new Leaf1("套装");

        root.addChild(c1);
        root.addChild(c2);
        c1.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        c2.addChild(leaf4);

        root.printStruct("");
    }
}
