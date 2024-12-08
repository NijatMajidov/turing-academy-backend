package backend.bankAccountSystem;

public class BankAccountSystemApp {
    public static void main(String[] args) {

        SavingsAccount savings1 = new SavingsAccount("Fexri", 5000, 101, 2.5);
        SavingsAccount savings2 = new SavingsAccount("Ali", 3000, 102, 3.0);
        CurrentAccount current1 = new CurrentAccount("Gunel", 2000, 201, 1000);
        CurrentAccount current2 = new CurrentAccount("Dilber", 1000, 202, 1500);
        BankAccount general = new BankAccount("Ella", 1500, 301);

        BankAccount[] accounts = {savings1, savings2, current1, current2, general};

        for (BankAccount account : accounts) {
            account.displayInfo();
            System.out.println("|-----------------------------------|");
        }

        savings1.deposit(500);
        System.out.println("|-----------------------------------|");
        savings2.withdraw(1000);
        System.out.println("|-----------------------------------|");
        current1.withdraw(2500);
        System.out.println("|-----------------------------------|");
        general.deposit(200);
        System.out.println("|-----------------------------------|");
        savings1.transfer(current1, 1000);
        System.out.println("|-----------------------------------|");
        current2.transfer(savings2, 500);
        System.out.println("|-----------------------------------|");

        savings1.applyInterest();
        savings2.applyInterest();
    }
}