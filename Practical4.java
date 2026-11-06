class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    double calculatePay() {
        return 20000;
    }
}

class Manager extends Employee {
    @Override
    double calculatePay() {
        return 50000;
    }
}

class Developer extends Employee {
    @Override
    double calculatePay() {
        return 35000;
    }
}

public class Practical4 {
    public static void main(String[] args) {

        System.out.println("Method Overloading:");

        Calculator cal = new Calculator();

        System.out.println("Addition of 2 numbers: " +
                cal.add(10, 20));

        System.out.println("Addition of 3 numbers: " +
                cal.add(10, 20, 30));

        System.out.println("Addition of decimal numbers: " +
                cal.add(10.5, 20.5));

        System.out.println("\nMethod Overriding:");

        Employee e;

        e = new Manager();
        System.out.println("Manager Salary: " + e.calculatePay());

        e = new Developer();
        System.out.println("Developer Salary: " + e.calculatePay());
    }
}