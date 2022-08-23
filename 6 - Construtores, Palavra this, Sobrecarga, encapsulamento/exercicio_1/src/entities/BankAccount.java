package entities;

public class BankAccount {
	
	private static final double TAX = 5.00; 

	private int account_number; 
	private String name; 
	private double balance;
	

	public BankAccount(int account_number, String name) {
		super();
		this.account_number = account_number;
		this.name = name;
	}
	

	public BankAccount(int account_number, String name, double initial_deposit) {
		super();
		this.account_number = account_number;
		this.name = name;
		deposit(initial_deposit);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount_number() {
		return account_number;
	}

	public double getBalance() {
		return balance;
	} 
	
	public void deposit(double deposit) {
		this.balance += deposit; 
	}
	
	public void whitdraw(double whitdraw) {
		this.balance -= whitdraw + TAX; 
	}
	
	public String toString() {
		return "Account " + account_number + 
				", Holder: " + name + 
				String.format(", Balance: $ %.2f%n", balance);
	}
	
	
}
