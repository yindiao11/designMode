package composite.demo;


/**
 * 叶子节点
 * @author: songdewei
 * @date: 2020/6/22
 */
public class Leaf implements Component{
    /**
     * 叶子节点名称
     */
    private String name;

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void printComponent(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}
