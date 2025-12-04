// Name: Ryan Lowry
// Date : 28/11/2025
// Student Number : C00305950
public class CD extends LibraryItem implements LoanItem {
    private String band;
    private String title;
    private int numTracks;

    public CD(String ID, String band, String title, int numTracks) {
        super("CD", ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    @Override
    public double calculatePrice() {
        return numTracks * 5.00;
    }
}
