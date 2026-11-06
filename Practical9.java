class Employee {

    String employeeName;
    double salary;

    static int count = 0;

    Employee() {
        this("Unknown", 0);
    }

    Employee(String employeeName, double salary) {

        this.employeeName = employeeName;
        this.salary = salary;

        count++;
    }

    void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }
}

public class Practical9 {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Rahul", 25000);

        Employee e3 = new Employee("Aman", 35000);

        System.out.println("Employee Details:");

        e1.display();
        e2.display();
        e3.display();

        System.out.println();

        Employee.displayCount();
    }
}