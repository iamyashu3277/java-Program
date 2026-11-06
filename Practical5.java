class ComplexNumber {

    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber c) {

        double r = this.real + c.real;
        double i = this.imaginary + c.imaginary;

        return new ComplexNumber(r, i);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Practical5 {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(4, 2);

        System.out.println("First Complex Number:");
        c1.display();

        System.out.println("Second Complex Number:");
        c2.display();

        ComplexNumber result = c1.add(c2);

        System.out.println("Sum of Complex Numbers:");
        result.display();
    }
}