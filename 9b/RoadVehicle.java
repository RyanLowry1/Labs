// Name: Ryan Lowry
// Date : 28/11/2025
// Student Number : C00305950
public class RoadVehicle implements ImportDuty {
    private int wheels;     
    private int passengers;  

    public RoadVehicle() {
        this(0, 0);
    }

    public RoadVehicle(int w, int p) {
        setWheels(w);
        setPass(p);
    }

    public void setWheels(int num) {
        wheels = num;
    }

    public int getWheels() {
        return wheels;
    }

    public void setPass(int num) {
        passengers = num;
    }

    public int getPass() {
        return passengers;
    }

    @Override
    public double calculateDuty() {
        return 0;
    }

    @Override
    public String toString() {
        return "Wheels = " + wheels + " | Passengers = " + passengers + " ";
    }
}
