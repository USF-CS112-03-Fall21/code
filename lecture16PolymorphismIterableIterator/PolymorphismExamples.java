import java.util.ArrayList;

public class PolymorphismExamples {
	
	public static void main(String[] args) {
		Philosopher human = new Philosopher("I think therefore I am -- Descartes");
		Dog dog = new Dog();
		human.speak();
		dog.speak();
		System.out.println();

		Speaker speaker;
		// Can NOT create an object of an interface - this would not work: speaker = new Speaker(); // WRONG

		speaker = new Philosopher("There is only one good, knowledge, and one evil, ignorance – Socrates");
		speaker.speak(); 
		
		// speaker.pontificate(); // this would not compile since pontificate is not in Speaker
		// ((Philosopher)speaker).pontificate(); // this works

		speaker = new Dog();
		speaker.speak();
		System.out.println();

		ArrayList<Speaker> talkingCreatures = new ArrayList<>();
		talkingCreatures.add(human);
		talkingCreatures.add(dog);
		talkingCreatures.add(new Philosopher("There is only one good, knowledge, and one evil, ignorance” – Socrates"));
		
		for (Speaker s: talkingCreatures) 
			s.speak();


	}

}