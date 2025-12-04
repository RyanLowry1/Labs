// Name: Ryan Lowry
// Date : 28/11/2025
// Student Number : C00305950
public class HGV extends RoadVehicle{
    private int cargo;

    public HGV() {
        this(0, 0, 0);
    }

    public HGV(int c, int w, int p) {
        super(w, p);
        setCargo(c);
    }

    public void setCargo(int size) {
        cargo = size;
    }

    public int getCargo() {
        return cargo;
    }

    @Override
    public double calculateDuty() {
        return getCargo() * HGVTAXRATE;
    }

    @Override
    public String toString() {
        return "HGV cargo = " + cargo + " | " + super.toString() + " | Duty = " + calculateDuty() + " | ";
    }
}
