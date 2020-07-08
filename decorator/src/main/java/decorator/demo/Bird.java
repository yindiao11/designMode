package decorator.demo;

/**
 * @author: songdewei
 * @date: 2020/6/22
 */
public class Bird extends Change {

    public Bird(TheGreatestSage sage) {
        super(sage);
    }
    @Override
    public void move() {
        System.out.println("Bird start...");

        super.move();
        // 代码
        System.out.println("Bird Move");
    }
}
