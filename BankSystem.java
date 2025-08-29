package simpleBankSystem;

import java.util.Scanner;

public class BankSystem {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Create new customer account
	        System.out.print("Enter customer name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter account number: ");
	        String accNo = sc.nextLine();

	        Customer customer = new Customer(name, accNo);

	        int choice;
	        do {
	            System.out.println("------ Bank Menu ---------");
	            System.out.println("1. Deposit Money");
	            System.out.println("2. Withdraw Money");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:System.out.print("Enter deposit amount: ");
	                    double depositAmount = sc.nextDouble();
	                    customer.deposit(depositAmount);
	                    break;
	                case 2: 
	                	System.out.print("Enter withdrawal amount: ");
	                    double withdrawAmount = sc.nextDouble();
	                    customer.withdraw(withdrawAmount);
	                    break;
	                case 3:customer.checkBalance();
	                    break;
	                case 4:
	                    System.out.println("Thank you! Visit again.");
	                    break;
	                default:
	                    System.out.println("Invalid choice  Try again.");
	            }
	        } while(choice != 4);

	    }

}
