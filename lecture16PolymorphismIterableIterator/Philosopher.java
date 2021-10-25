public class Philosopher implements Speaker {
	
	private String quote;

	public Philosopher(String quote) {
		this.quote = quote;
	}

	@Override
	public void speak() {
		System.out.println(quote);
	}

	public void pontificate() {
		System.out.println("Java is the only language worth learning");
	}
}