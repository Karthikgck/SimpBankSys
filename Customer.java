package simpleBankSystem;

public class Customer {
	
	   private String name;
	    private BankAccount account;

	    public Customer(String name, String accountNumber) {
	        this.name = name;
	        this.account = new BankAccount(accountNumber);
	    }

	    public void deposit(double amount) {
	        account.deposit(amount);
	    }

	    public void withdraw(double amount) {
	        account.withdraw(amount);
	    }

	    public void checkBalance() {
	        account.checkBalance();
	    }

	    public String getName() {
	        return name;
	    }

	    public String getAccountNumber() {
	        return account.getAccountNumber();
	    }

}
