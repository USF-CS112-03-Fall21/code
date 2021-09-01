/** This class demonstrates how to use String class.
 *  Check Java 8 API for class String:
 *  https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
 *
 *  This example is not meant to demonstrate good design!
 *  In fact, having all your code in the main method is not a good idea.
 *  Soon we will learn more about object-oriented programming in Java,
 *  and our examples will have a much better design.
 */
public class StringExample {
    public static void main(String[] args) {

        String s0 = "hello";
        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println(s0 == s1);
        System.out.println(s0 == s2);

        
        //declare a string reference
        String s1;
        // point it to an object
        s1 = new String("Luke Skywalker");

        // We can also combine the two lines
        String s2 = new String("Yoda");

        // For strings, we can actually omit the new keyword
        // since it is such a commonly used class
        String s3 = "Darth Vader";

        // Calling methods on strings
        int length = s1.length(); // length of the string
        System.out.println(length);

        char firstLetter = s1.charAt(0); // first letter of string s1
        System.out.println(firstLetter);

        if (s2.endsWith("a"))
            System.out.println("String s2 ends with an a");

        // Use .equals to compare strings (do not use == to compare strings! )
        if (s1.equals(s2)) {
            System.out.println("Yoda is the same as Luke Skywalker. Wait, what??");
        }
        System.out.println(s3.toLowerCase());
        // note: s3 will not change! toLowercase method will return a new string in lowercase

        // Demonstrate concatenation using + operator
        String s = s2 + " is pretty cool, but so is " + s3;
        System.out.println(s);
    }
}
