package Files;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    public Library(){
        this.Books = new ArrayList<Book>();
    }

    private String Name;

    public ArrayList<Book> getBooks() {
        return Books;
    }

    private ArrayList<Book> Books;

    public String GetAllBooksInfo(){
        for (Book book : this.Books){
            return book.toString() + "\n";
        }
        return null;
    }

    public void AddBook(Book book){
        if(book != null) this.Books.add(book);
    }

    public Book[] GetBooksByAuthor(String authorName){
        return this.Books.stream()
                .filter(x -> x.getAuthor() == authorName).toArray(Book[] :: new);
    }

    public String GetBook(long ISBN){
        Book book = this.Books.stream()
                .filter(x -> x.getISBN() == ISBN)
                .findFirst().orElse(null);

        if (book != null){
            return book.toString();
        }

        return null;
    }

    public boolean RemoveBook(long ISBN){
        Book book = this.Books.stream().filter(x -> x.getISBN() == ISBN).findFirst().orElse(null);
        if (book != null) {
            return this.Books.remove(book);
        }
        else{
            return false;
        }
    }

    public void RemoveBooksByAuthor(ArrayList<Book> books){

        this.Books.removeAll(books);
    }

    public void RemoveBooksByAuthor(String authorName){

        var books = this.GetBooksByAuthor(authorName);
        this.RemoveBooksByAuthor(new ArrayList<Book>(Arrays.asList(books)));
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


}
