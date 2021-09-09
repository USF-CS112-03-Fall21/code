/** A class that models a rolling die */
public class Die {
    public static final int MAX_SIDES = 6; // number of sides, a constant
    private int faceValue; // face value, an instance variable of the class

    /** Default constructor */
    public Die() {
        faceValue = 1;
    }

    /** Another constructor for class Die
     * that takes a parameter
     * @param faceValue initial value of faceValue
     */
    public Die(int face) {
        if (face < 1 || face > MAX_SIDES) 
             System.out.println("Face value out of range");
        else
            faceValue = face;
    }

    /**
     * Rolls the die: by generating a random integer from 1 to 6
     */
    public void roll() {
        faceValue = (int)(Math.random() * MAX_SIDES) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int face) {
       if (face < 1 || face > MAX_SIDES) 
            System.out.println("Face value out of range");
       else
            faceValue = face;
    }

    /**
     * Returns the string that contains face value
     * @return face value as a string
     */
    public String toString() {
        String res =  "Face value: " + faceValue;
        return res;
    }

}
