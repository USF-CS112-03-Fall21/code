//********************************************************************
//  GradeRange.java       Author: Lewis/Loftus
//
//  Demonstrates the use of an array of objects.
//********************************************************************

import java.util.Scanner;
import java.util.Arrays;

public class GradeRange
{
   //-----------------------------------------------------------------
   //  Creates an array of Grade objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {

      Grade[] grades = new Grade[3];
      Scanner sc = new Scanner(System.in);

      int currIndex = 0;

      for (int i = 0; i < 3; i++) {
         System.out.println("Enter grade: ");
         String name = sc.next();
         int lowerBound = sc.nextInt();

         Grade grade = new Grade(name, lowerBound);
         grades[currIndex] = grade;

         // Can combine two lines before this one into one:
         // grades[currIndex] = new Grade(name, lowerBound);

         currIndex++;
      }

      /* We could have also assigned values directly like this:
         grades[0] = new Grade("A", 94);
         grades[1] = new Grade("B", 84);
         grades[2] = new Grade("B+", 87);
      */

      /*
      // Or we could use an initializer list for array of objects
      Grade[] grades =
      {
         new Grade("A", 95), new Grade("A-", 90),
         new Grade("B+", 87), new Grade("B", 85), new Grade("B-", 80),
         new Grade("C+", 77), new Grade("C", 75), new Grade("C-", 70),
         new Grade("D+", 67), new Grade("D", 65), new Grade("D-", 60),
         new Grade("F", 0)
      };

      */

     System.out.println();
     // Print grades using for each loop
     System.out.println("Before changing the grades");
      for (Grade g: grades) {
         System.out.println(g); // Java will call toString() method in class Grade to print each grade
      }
      
      changeGradesIndices(grades, 2);

      System.out.println("After changing the grades");
      System.out.println(Arrays.toString(grades));

      // Test creating new grades
      createNewGradesUsingIndices(grades, 10);
      // createNewGradesForEachIncorrect(grades, 10);
      System.out.println("After creating new grades");
      System.out.println(Arrays.toString(grades));

   }

  /**
  * Changes the lower bound for each grade by adding num.
  */
   public static void changeGradesIndices(Grade[] grades, int num) {
      for (int i = 0; i < grades.length; i++) {
         Grade grade = grades[i];
         grade.setLowerBound(grade.getLowerBound() + num);

      }
     }

    public static void changeGradesForEach(Grade[] grades, int num) {
      
      // Can we use a for each loop to change the grades?
      for (Grade grade: grades) {
         grade.setLowerBound(grade.getLowerBound() + num);
      }
   }


   public static void createNewGradesUsingIndices(Grade[] grades, int num) {
      for (int i = 0; i < grades.length; i++) {
            grades[i] = new Grade(grades[i].getName(), grades[i].getLowerBound() + num);
      }
     }   
   // This would not work!
   public static void createNewGradesForEachIncorrect(Grade[] grades, int num) {
      
      for (Grade grade: grades) {
         grade = new Grade(grade.getName(), grade.getLowerBound() + num);
         // Will not change the array! Only the local variable grade
      }
   } 



}
