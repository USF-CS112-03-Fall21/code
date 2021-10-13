import java.util.*;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Moveable> aliens = new ArrayList<>();
		aliens.add(new AlienX());
		aliens.add(new AlienY());

		for (int i = 0; i < aliens.size(); i++) {
			// move each alien twice
			aliens.get(i).move();
			aliens.get(i).move();
			System.out.println(aliens.get(i)); // print info about x, y coordinates of the alien
		}

	}

}