
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDetails() {
        return "Name:  " + name + ",  Salary:  " + salary;
    }
}

class Manager extends Employee {
    private String department;

    // Constructor using super() to initialize name and salary
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    // Overridden method to include department
    @Override
    public String getDetails() {
        return super.getDetails() + ",  Department:  " + department;
    }
}

public class Exercise {
    public static void main(String args[]) {

        Employee emp1 = new Employee("Alice", 50000.0);
        Employee emp2 = new Manager("Bob", 80000.0, "IT");

        // Polymorphism in action
        System.out.println(emp1.getDetails());
        System.out.println();
        System.out.println(emp2.getDetails());

    }

}
