package composite.teach2;

/**
 * @author: songdewei
 * @date: 2020/6/22
 */
public class Leaf1 extends Component1 {
    /**
     * 叶子对象的名字
     */
    private String name;
    /**
     * 构造方法，传入叶子对象的名称
     * @param name 叶子对象的名字
     */
    public Leaf1(String name){
        this.name = name;
    }
    /**
     * 输出叶子对象的结构，叶子对象没有子对象，也就是输出叶子对象的名字
     * @param preStr 前缀，主要是按照层级拼接的空格，实现向后缩进
     */
    @Override
    public void printStruct(String preStr) {
        // TODO Auto-generated method stub
        System.out.println(preStr + "-" + name);
    }

}
