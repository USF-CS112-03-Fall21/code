//********************************************************************
//  TempConverter.java       Author: Lewis/Loftus
//
//  Demonstrates the use of primitive data types and arithmetic
//  expressions.
//********************************************************************

import java.util.Scanner;

public class TempConverter
{
   //-----------------------------------------------------------------
   //  Computes the Fahrenheit equivalent of a specific Celsius
   //  value using the formula F = (9/5)C + 32.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int BASE = 32;
      final double CONVERSION_FACTOR = 9.0 / 5.0;

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the temp in C");



      double fahrenheitTemp;
      int celsiusTemp = sc.nextInt();  //24;  // value to convert
      // fahrenheitTemp = celsiusTemp * 9.0/5.0 + 32;

      fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;

      System.out.println ("Celsius Temperature: " + celsiusTemp);
      System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
   }
}
