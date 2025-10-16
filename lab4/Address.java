public class Address{
    private String street;
    private String town;
    private String county;

    //Constructor

    public Address(String county, String street, String town) {
        setStreet(street);
        setTown(town);
        setCounty(county);
    }

    //Getters & Setters

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    //ToString

    public String toString(){
        return "Address " + street + town + county + " ";
    }

}
