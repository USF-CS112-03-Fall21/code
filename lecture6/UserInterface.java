import java.util.Scanner;

public class UserInterface {
	
	private Calculator calc;

	public UserInterface() {
		calc = new Calculator();
	}

	public void interactWithUser() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		String op;
		int num;
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter operation: + or - ");
			op = sc.next();
			System.out.println("Enter a number :");
			num = sc.nextInt();
			result = compute(op, num);
		}

		System.out.println(result);
	}

	public int compute(String operation, int num) {
		if (operation.equals("+"))
			calc.add(num);
		else
			if (operation.equals("-"))
				calc.substract(num);

		return calc.getResult();

	}

	public static void main(String[] args) {
		UserInterface ui = new UserInterface();
		ui.interactWithUser();

	}
}