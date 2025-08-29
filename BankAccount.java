package simpleBankSystem;

public class BankAccount {
	
	private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0; 
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("!! amount must be positive");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println(" !! amount must be positive");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
