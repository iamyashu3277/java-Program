class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Person {
    void showPerson() {
        System.out.println("I am a person.");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("I am an employee.");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("I am a manager.");
    }
}

class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void area(double radius) {
        System.out.println("Circle Area: " +
                (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    void area(double length, double width) {
        System.out.println("Rectangle Area: " +
                (length * width));
    }
}

public class Practical2 {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Car c = new Car();
        c.start();
        c.drive();

        System.out.println("\nMultilevel Inheritance:");
        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();

        System.out.println("\nHierarchical Inheritance:");

        Circle circle = new Circle();
        circle.display();
        circle.area(5);

        Rectangle rectangle = new Rectangle();
        rectangle.display();
        rectangle.area(4, 6);
    }
}