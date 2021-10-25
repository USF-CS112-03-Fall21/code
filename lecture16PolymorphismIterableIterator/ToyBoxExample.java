import java.util.Iterator;

public class ToyBoxExample {
	public static void main(String[] args) {
		ToyBox box = new ToyBox();
		box.add("bear");
		box.add("car");
		box.add("lego");
		box.add("puzzle");

		Iterator<String> it = box.iterator();
		while (it.hasNext())
			System.out.println(it.next());

		for (String toy: box) {
			System.out.println(toy);
		}
	}

}
