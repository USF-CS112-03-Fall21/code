public class BankAccount {
	private String name;
	private double balance;


	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance  = balance;
	}

	public double withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("Not enough money to withdraw " + amount);
			return this.balance;
		}

		balance = balance - amount;
		return balance;

	}

	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}



}