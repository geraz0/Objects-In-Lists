import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    // Constructor
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    // Getter for the title
    public String getTitle() {
        return title;
    }

    // Overridden toString method to print all details
    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + publicationYear;
    }

    // Main method to handle user interaction and manage Book objects
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input loop for books
        while (true) {
            System.out.println("Enter the name of the book, or an empty string to stop:");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Enter the number of pages:");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        // Asking the user what to print
        System.out.println("What information will be printed? everything or name");
        String printType = scanner.nextLine();

        // Displaying book information based on user input
        if ("everything".equalsIgnoreCase(printType)) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if ("name".equalsIgnoreCase(printType)) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
