class Book {

    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------");
    }
}

public class Practical6 {
    public static void main(String[] args) {

        Book b1 = new Book();

        Book b2 = new Book("Java Programming",
                "James Gosling", 550);

        Book b3 = new Book(b2);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("Parameterized Constructor:");
        b2.display();

        System.out.println("Copy Constructor:");
        b3.display();

        b3.price = 700;

        System.out.println("After Modifying Copy Object:");

        System.out.println("Original Book:");
        b2.display();

        System.out.println("Copied Book:");
        b3.display();
    }
}