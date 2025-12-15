
public class Manager extends Employee {

    private String department;

    public Manager() {
    }

    public Manager(String department) {
        this.department = department;
    }

    public Manager(String department, int id, int salary) {
        super(id, salary);
        this.department = department;
    }

    public Manager(String department, int id, int salary, String name, int age) {
        super(id, salary, name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" + "department=" + department + '}';
    }

}
