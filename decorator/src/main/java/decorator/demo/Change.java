package decorator.demo;

/**
 * @author: songdewei
 * @date: 2020/6/22
 */
public class Change implements TheGreatestSage{
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        sage.move();
    }
}
