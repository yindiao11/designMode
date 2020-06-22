package composite.demo1;

/**
 * @author: songdewei
 * @date: 2020/3/22
 */
public class Employee extends HumanResource {
    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}