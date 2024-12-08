package backend.bankAccountSystem;

class SavingsAccount extends BankAccount {

    private double monthlyInterestRate;
    private int withdrawalLimit = 3;

    public SavingsAccount(String accountHolder, double balance, int accountNumber, double monthlyInterestRate) {
        super(accountHolder, balance, accountNumber);
        this.monthlyInterestRate = monthlyInterestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (withdrawalLimit > 0 && amount > 0 && super.getBalance() >= amount) {
            super.withdraw(amount);
            withdrawalLimit--;
            System.out.println("Withdrawals remaining: " + withdrawalLimit);
        } else {
            System.out.println("Withdrawal failed. Check limit or balance.");
        }
    }

    public void applyInterest() {
        double balance = super.getBalance();
        double interest = balance * monthlyInterestRate / 100;
        balance += interest;
        System.out.println("Interest applied: " + interest + ". New balance: " + balance);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Monthly Interest Rate: " + monthlyInterestRate + "%");
        System.out.println("Remaining Withdrawals: " + withdrawalLimit);
    }
}