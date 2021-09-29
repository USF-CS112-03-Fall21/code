//********************************************************************
//  Beatles.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a ArrayList object.
//********************************************************************

import java.util.ArrayList;

public class Beatles
{
   //-----------------------------------------------------------------
   //  Stores and modifies a list of band members.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      ArrayList<String> band = new ArrayList<String>();

      band.add("Paul");
      band.add("Pete");
      band.add("John");
      band.add("George");

      System.out.println(band);

      int location = band.indexOf("Pete");
      band.remove(location);

      System.out.println(band);

      System.out.println("At index 1: " + band.get(1));
      band.add(2, "Ringo");

      System.out.println("Size of the band: " + band.size());
      int index = 0;
      while (index < band.size())
      {
         System.out.println(band.get(index));
         index++;
      } 

      // Iterating with a for loop
      // FILL IN CODE
   }
}
