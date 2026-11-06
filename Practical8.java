class Product {

    String productName;
    double price;
    int quantity;

    Product() {
        productName = "Unknown";
        price = 0;
        quantity = 0;
    }

    Product(String productName) {
        this.productName = productName;
        price = 0;
        quantity = 0;
    }

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        quantity = 1;
    }

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotal() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotal());
        System.out.println("---------------------");
    }
}

public class Practical8 {
    public static void main(String[] args) {

        Product p1 = new Product();

        Product p2 = new Product("Laptop");

        Product p3 = new Product("Mouse", 500);

        Product p4 = new Product("Keyboard", 1000, 2);

        System.out.println("No-Argument Constructor:");
        p1.display();

        System.out.println("Name Constructor:");
        p2.display();

        System.out.println("Name and Price Constructor:");
        p3.display();

        System.out.println("All Arguments Constructor:");
        p4.display();
    }
}