/** A simple interface with a default method  */
interface Speak {

   void say(String greeting);

   default void shout() {
       System.out.println("Let's fight!");
   }

}
