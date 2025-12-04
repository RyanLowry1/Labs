// Name: Ryan Lowry
// Date : 28/11/2025
// Student Number : C00305950
public class Book extends LibraryItem implements LoanItem{
    private String author;
    private String title;
    private int pages;

    public Book(String ID, String author, String title, int pages) {
        super("Book", ID);
        this.author = author;
        this.title = title;
        this.pages = pages;
    }  

    @Override
    public double calculatePrice() {
        return pages * 0.01;
    }
}
