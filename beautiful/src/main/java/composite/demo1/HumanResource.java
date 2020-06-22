package composite.demo1;

/**
 * @author: songdewei
 * @date: 2020/3/22
 */

public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}




