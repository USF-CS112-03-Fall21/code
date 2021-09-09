public class Game {
	
	public static void main(String[] args) {
		Die die1 = new Die(4);
		Die die2 = new Die();

		die1.roll();
		die2.roll();

		System.out.println(die1.getFaceValue());
		die1.setFaceValue(5);

		System.out.println(die1.getFaceValue());

	} 

}