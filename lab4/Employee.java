public class Employee{

    private Address address;
    private static int nextNumber = 1000;
    private int employeeNo;
    private String name;
    private String surname;
    private String type;
    private String carType;

    //Constructors

    public Employee(String name, String surname, Address address, String type) {
        setAddress(address);
        setName(name);
        setSurname(surname);
        setType(type);
        nextNumber++;
    }

    //Getters & Setters

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    //Method
    public static int EmployeeRecord(){
        return nextNumber - 1000;
    }

    //ToString

    public String toString(){
        if (type.equalsIgnoreCase("Manager")) {
    return "Employee : First Name = " + name + ", Surname = " + surname + ", Address = " + address + ", Employee Number = " 
        + employeeNo + ", Employee Type = " + type + ", Car Type = " + carType + "\n";
    }
    else {
        return "Employee : First Name = " + name + ", Surname = " + surname + ", Address = " + address + ", Employee Number = " 
        + employeeNo + ", Employee Type = " + type + ", Car Type = " + carType + "\n";
    }

    }
       
}

