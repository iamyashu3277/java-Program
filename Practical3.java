interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}


class Machine {
    void powerOn() {
        System.out.println("Machine is powered on.");
    }
}

interface Connectable {
    void connect();
}

class SmartPrinter extends Machine implements Printable, Connectable {

    public void print() {
        System.out.println("Smart printer is printing.");
    }

    public void connect() {
        System.out.println("Smart printer connected to Wi-Fi.");
    }
}

public class Practical3 {
    public static void main(String[] args) {

        System.out.println("Multiple Inheritance Using Interfaces:");

        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        System.out.println("\nHybrid Inheritance:");

        SmartPrinter sp = new SmartPrinter();
        sp.powerOn();
        sp.print();
        sp.connect();
    }
}