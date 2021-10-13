/** The main class for the Speak/GameCharacter example that demonstrates how default methods work */
public class Talking {
    public static void main(String[] args) {
        GameCharacter c = new GameCharacter();
        c.say("Hello");
        c.shout();

        /*Speaker speaker = new Philosopher();
        speaker.speak();
        ((Philosopher) speaker).pontificate();
        speaker = new Dog();
        speaker.speak();
        */

    }
}
