// Name: Ryan Lowry
// Date : 28/11/2025
// Student Number : C00305950
public class Car extends RoadVehicle{
    private String carType;

    public Car() {
        this("", 0, 0);
    }

    public Car(String c, int w, int p) {
        super(w, p);
        setType(c);
    }

    public void setType(String t) {
        carType = t;
    }

    public String getType() {
        return carType;
    }

    @Override
    public double calculateDuty() {
        return getWheels() * CARTAXRATE;
    }

   @Override
    public String toString() {
        return "Car type = " + carType + " | " + super.toString() + " | Duty = " + calculateDuty() + " | ";
    }
}
