// Name: Ryan Lowry
// Date : 28/11/2025
// Student Number : C00305950
public class Driver {
    public static void main(String args[]){

        Car car1 = new Car();
        car1.setWheels(4);
        car1.setPass(6);
        car1.setType("saloon");
        System.out.println("Car1: " + car1);

        Car car2 = new Car();
        car2.setWheels(4);
        car2.setPass(7);
        car2.setType("People carrier");
        System.out.println("Car2: " + car2);

        HGV h = new HGV(3200, 8, 2);
        System.out.println("HGV: " + h);

        RoadVehicle rv[] = new RoadVehicle[3];
        rv[0] = car1;
        rv[1] = car2;
        rv[2] = h;

        for(RoadVehicle r : rv){
            System.out.println(r);
        }
    }
}
