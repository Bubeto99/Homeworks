package Files;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    Library library = new Library();

    public void TestProgram(){
        this.library.AddBook(new Book("Book1", "Stephen King", "Komiks", 1992, 931714123));
        this.library.AddBook(new Book("Book2", "Larry", "Izdatelstvo", 1932, 123124123));
        this.library.AddBook(new Book("Book3", "Connor", "Sphincs", 1995, 93123123));
        this.library.AddBook(new Book("Book4", "George", "Komiks2", 1996, 11244123));

        System.out.println("All books: ");

        for(Book book : library.getBooks()){
            System.out.println(book.toString());
        }

        Book[] stephenKingBooks =library.GetBooksByAuthor("Stephen King");

        this.library.RemoveBooksByAuthor(new ArrayList<Book>(Arrays.asList(stephenKingBooks)));

        System.out.println("All books: ");

        for(Book book : library.getBooks()){
            System.out.println(book.toString());
        }
    }
}
