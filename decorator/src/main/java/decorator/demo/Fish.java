package decorator.demo;

/**
 * @author: songdewei
 * @date: 2020/6/22
 */
public class Fish extends Change {

    public Fish(TheGreatestSage sage) {
        super(sage);
    }
    @Override
    public void move() {
        System.out.println("Fish start...");

        super.move();
        // 代码
        System.out.println("Fish Move");
    }
}
