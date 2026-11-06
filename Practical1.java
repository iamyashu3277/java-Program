public class Student {
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    Student(int rollNo, String name, int m1, int m2, int m3) {
        this.rollNo = rollNo;
        this.name = name;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    int calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("----------------------");
    }
}

public class Practical1 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 85, 90, 80);
        Student s2 = new Student(102, "Aman", 75, 88, 92);
        Student s3 = new Student(103, "Rohit", 90, 95, 85);

        s1.display();
        s2.display();
        s3.display();
    }
} 

