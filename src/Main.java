import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book title: ");
        String title = sc.nextLine();

        System.out.println("Enter book author: ");
        String author = sc.nextLine();

        System.out.println("Enter book price: ");
        double price = sc.nextDouble();

        Book myBook = new Book(title, author, price);

        System.out.println();
        myBook.display();

        System.out.println("Enter updated price: ");
        double newPrice = sc.nextDouble();
        myBook.setPrice(newPrice);

        System.out.println("Updated price: " + myBook.getPrice());
    }
}