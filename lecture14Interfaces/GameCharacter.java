/** The class has no definition of the shout() method,
 *  but it's ok since there is a default implementation in the interface.
 *  The class can also override the shout method. */
public class GameCharacter implements Speak {

    @Override
    public void say(String greeting) {

        System.out.println(greeting + ". Thanks for listening!");
    }




}

