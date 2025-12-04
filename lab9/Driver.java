// Name: Ryan Lowry
// Date : 28/11/2025
// Student Number : C00305950
public class Driver {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[2];

        items[0] = new Book("Book1", "Jk Rowling", "Harry Potter", 500);
        items[1] = new CD("CD1", "Coldplay", "Parachutes", 8);
        for (LibraryItem item : items) {
            if (item instanceof LoanItem) {
                LoanItem loan = (LoanItem) item;
                System.out.println(item.getType() + " ID: " + item.getId() +  " Price: " + loan.calculatePrice());
            }
        }
    }
}
