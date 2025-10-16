public class Office{

    private static int nextRoomNumber = 100;
    private int roomNumber;
    private int numberOfEmployees = 0;
    private Employee[] employees = new Employee[2];

    //Constructor

    public Office() {
        setRoomNumber(nextRoomNumber);
        nextRoomNumber++;
    }

    //Getters & Setters

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
   
    //Method
    public void addEmployee(Employee employee){
        if(numberOfEmployees <= 2){
            employees[numberOfEmployees] = employee;
            numberOfEmployees++;
        }
        else{
            System.out.print("Maximum Employees reached");
        }
    }
    public String printEmployee(){
        String employeeDetails = "";
        for(Employee emp : employees){
            if(emp!=null){
                employeeDetails+=emp.getEmployeeNo() + " " + emp.getName() + " " + emp.getSurname();
            }
        }
        return employeeDetails;
    }

    //ToString
    public String toString() {
        return "Office Number {" + roomNumber + "}";
    }
}