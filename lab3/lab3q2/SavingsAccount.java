public class SavingsAccount{
    private int accountNumber;
    private static int nextAccountNumber = 0;
    private static float annualInterestRate = 0.0f;
    private double savingsBalance;
    //Constructor
    public SavingsAccount() {
        ++nextAccountNumber;
        setAccountNumber(nextAccountNumber);
    }

    public SavingsAccount(double savingsBalance) {
        ++nextAccountNumber;
        setAccountNumber(nextAccountNumber);
        setSavingsBalance(savingsBalance);
    }

    //Getters & Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(float annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    //Methods 
    public void calculateMonthlyInterest(){
        savingsBalance+=((getSavingsBalance() * getAnnualInterestRate())/12);
    }

    //To String
    public String toString(){
        return "Savings Account AccountNumber= " + accountNumber + ", SavingsBalace = " + savingsBalance +" ";
    }
}