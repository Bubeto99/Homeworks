package Files;

public final class Book {

    public Book(String title, String author, String publisher, int yearOfPublishing, long ISBN){
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublisher(publisher);
        this.setYearOfPublishing(yearOfPublishing);
        this.setISBN(ISBN);
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        YearOfPublishing = yearOfPublishing;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public int getYearOfPublishing() {
        return YearOfPublishing;
    }

    public long getISBN() {
        return ISBN;
    }

    private int YearOfPublishing;
    private long ISBN;
    private String Title;
    private String Author;
    private String Publisher;

    @Override
    public String toString(){
        return new String(
                this.getAuthor() + "\n"
                        + this.getTitle() + "\n"
                        + this.getPublisher() + "\n"
                        + this.getYearOfPublishing() + "\n"
                        + this.getISBN() + "\n");

    }
}
