
public class ArrayExample
{

   public static void main (String[] args)
   {
      int[] scores = new int[5];
      scores[0] = 70;
      scores[1] = 85;
      scores[2] = 91;
      scores[3] = 99;
      scores[4] = 82;

      //System.out.println(scores); // Will print only the address of the first element of the array

      // System.out.println(scores[5]); // Exception occurs since index 5 does not exist

      int randomIndex = (int)(5*Math.random());
      //System.out.println(scores[randomIndex]);


      // Printing the array
      /*
      for (int i =0; i < scores.length; i++) {
         System.out.println(scores[i] + " ");
      }

      for (int sc : scores)
          System.out.println(sc);
      */

      // Assigning values
      for (int i =0; i < scores.length; i++) {
         scores[i] = i * 10;
      }  

      int k = 0;
      for (int sc : scores) { // Does not change the array! Because sc is just a copy of each cell of the array.
          sc = k;
          k++;
      }

      for (int sc : scores)
          System.out.println(sc);

      // Compute the sum of the elements of the array
      /* 
      int sum = 0;
      for (int i =0; i < scores.length; i++) {
         sum = sum + scores[i];
      }   
      */  



   }
}
