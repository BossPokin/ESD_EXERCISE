import java.util.List;

public class Department {
    private String name;
    private int employee_amount;
    private List<Department> departments;

    public Department(String name, int employee_amount) {
        this.name = name;
        this.employee_amount = employee_amount;
    }

    public void add(Department department) {
        departments.add(department);
    }

    public void remove(Department department) {
        departments.remove(department);
    }

    public String toString() {
        return name + ": " + employee_amount;
    }

}
