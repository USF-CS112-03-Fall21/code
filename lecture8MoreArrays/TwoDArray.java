//********************************************************************
//  TwoDArray.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a two-dimensional array.
//********************************************************************

public class TwoDArray
{
   //-----------------------------------------------------------------
   //  Creates a 2D array of integers, fills it with increasing
   //  integer values, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      // Simple example first:
      int[][] grades = new int[4][3];
      // first row
      grades[0][0] = 93;
      grades[0][1] = 84;
      grades[0][2] = 87;

      // second row
      grades[1][0] = 60;
      grades[1][1] = 95;
      grades[1][2] = 77;

      // third row
      grades[2][0] = 99;
      grades[2][1] = 98;
      grades[2][2] = 73;

      // fourth row
      grades[3][0] = 75;
      grades[3][1] = 77;
      grades[3][2] = 78;

      // TOD: print the array

      /*
      // Slightly more complicated example:
      int[][] table = new int[5][10];

      // Load the table with values
      for (int row=0; row < table.length; row++)
         for (int col=0; col < table[row].length; col++)
            table[row][col] = row * 10 + col;

      // Print the table
      for (int row=0; row < table.length; row++)
      {
         for (int col=0; col < table[row].length; col++)
            System.out.print (table[row][col] + "\t");
         System.out.println();
      } */
   }
}
