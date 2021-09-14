public class BankAccountTester {
	
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("Jennifer Chen", 1000.0);

		double newBalance = account1.withdraw(50);
		newBalance = account1.deposit(400);
		System.out.println(newBalance);

	
		BankAccount account2 = new BankAccount("Priya Kumar", 2005.0);
		newBalance = account2.withdraw(45);



	}

}