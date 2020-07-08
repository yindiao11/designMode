package composite.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: songdewei
 * @date: 2020/6/22
 */
public class Composite implements Component{
    /**
     * 节点名称
     */
    private String name;

    /**
     * 子节点名称
     */
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    /**
     * 增加一个子组件
     * @param child 子构件对象
     */
    public void addChild(Component child){
        children.add(child);
    }

    @Override
    public void printComponent(String prefix) {
        System.out.println(prefix + "+" + name);
        if(null != children){
            for(Component c : children){
                c.printComponent(prefix + prefix);
            }

        }


    }
}
