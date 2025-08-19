public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount account1 = new SavingsAccount();
        account1.name = "Fikri";
        account1.balance = 1000.0;
        account1.interestRate = 0.05;
        account1.displayCusstomer();

        SavingsAccount account2 = new SavingsAccount();
        account2.name = "Rina";
        account2.balance = 9000.;
        account2.interestRate = 0.03;
        account2.displayCusstomer();
         
        SavingsAccount account3 = new SavingsAccount();
        account3.name = "Joko";
        account3.balance = 5000.0;
        account3.interestRate = 0.04;
        account3.displayCusstomer();

    }
    
}
