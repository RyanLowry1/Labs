public class BankDriver{
    
    public static void main(String[]args){

        SavingsAccount saver1 = new SavingsAccount();

        saver1.setSavingsBalance(2000.00);

        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.setAnnualInterestRate(0.04f);

        saver1.calculateMonthlyInterest();

        saver2.calculateMonthlyInterest();

        System.out.println(saver1.toString());
        System.out.println(saver2.toString());

        //--------------------------------------------------------
        System.out.println("----- Next Month -----");
        SavingsAccount.setAnnualInterestRate(0.05f);

        saver1.calculateMonthlyInterest();

        saver2.calculateMonthlyInterest();

        System.out.println(saver1.toString());
        System.out.println(saver2.toString());

        //--------------------------------------------------------

        BankCustomer bc = new BankCustomer("Ryan" , "Kildare");
        bc.addAccount(saver1);
        bc.addAccount(saver2);

        System.out.println(bc);
        System.out.println("Savings Total " + bc.balance(bc.getSavingAccs()));

    }
}