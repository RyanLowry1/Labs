import java.util.Scanner;
public class MyHR{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int choice = 0;
        Employee[] emps = new Employee[5];
        Office[] offices = new Office[3];

        for(int i = 0; i <= 2; i++){
            Office office = new Office();
            offices[i] = office;
        }

        while(choice != 4){
            System.out.println("1: List all offices");
            System.out.println("2. Create a new employee record");
            System.out.println("3. List all employees");
            System.out.println("4. Exit");
            choice = in.nextInt();

            switch (choice){

                case 1:
                for(Office office : offices){
                    System.out.println("Number of employees " + office.getNumberOfEmployees());
                }
                break;
            
                case 2:
                if(emps.length <=5){
                    String name;
                    String surname;
                    String street;
                    String town;
                    String county;
                    String type;
                    String carType = null;
                    Scanner inEmp = new Scanner(System.in);
                    System.out.print("Enter Employees First Name: ");
                    name = inEmp.nextLine();
                    System.out.print("Enter Employees Surname: ");
                    surname = inEmp.nextLine();
                    System.out.print("Enter Street Name: ");
                    street = inEmp.nextLine();
                    System.out.print("Enter Employees Town: ");
                    town = inEmp.nextLine();
                    System.out.print("Enter Employees County: ");
                    county = inEmp.nextLine();
                    System.out.print("Enter if Employee is Staff or Manager: ");
                    type = inEmp.nextLine();
                    if(type.equals("Manager")){
                        System.out.print("Enter company car type: ");
                        carType = inEmp.nextLine();
                    }
                    Address address = new Address(street , town , county);
                    Employee emp = new Employee(name, surname, address, type);
                    emp.setCarType(carType);
                    emps[Employee.EmployeeRecord()]=emp;
                    for(Office office : offices){
                        if(office.getNumberOfEmployees() <= 2){
                            office.addEmployee(emp);
                            break;
                        }
                    }

                 }
                break;
                case 3:
                for(Employee emp : emps){
                    if(emp!=null){
                        System.out.print(emp);
                    }
                }
               
                break;
                case 4:
                System.out.println("Goodbye");
                System.exit(0);
                default:
                System.out.println("Invalid choice , Please enter 1, 2, 3, or 4");
                break; 
            }
        }
    }
}