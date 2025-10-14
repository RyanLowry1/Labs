import java.util.Arrays;
public class BankCustomer{

    private String name;
    private String address;
    private SavingsAccount[] savingAccs = new SavingsAccount[3];
    private int numberOfAccounts = 0;

    //Constructor

    public BankCustomer(String name, String address) {
        setAddress(address);
        setName(name);
    }
    

    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SavingsAccount[] getSavingAccs() {
        return savingAccs;
    }

    public void setSavingAccs(SavingsAccount[] savingAccs) {
        this.savingAccs = savingAccs;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void setNumberOfAccounts(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }
    

    //Methods
    public void addAccount(SavingsAccount sav){
        if(getNumberOfAccounts() <= 2){
            savingAccs[getNumberOfAccounts()]=sav;
            setNumberOfAccounts(getNumberOfAccounts()+ 1);
        }
        else{
            System.out.print("Number of accounts reached");
        }
    }

    public double balance(SavingsAccount[]savingsAccounts){
        double balance = 0;
        for(SavingsAccount sav : savingAccs){
            if(sav != null) balance+= sav.getSavingsBalance();
        }
        return balance;
    }

    public String toString(){
        return "Bank Customer Name = " + name + " address = " + address + " SavingAccounts = " + Arrays.toString(savingAccs);
    }

}