import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        
        Student st1 = new Student("Zack", 1, 3.4);
        Student st2 = new Student("Abigail", 2, 3.9);
        Student st3 = new Student("Bao", 3, 3.6);
        Student st4 = new Student("Priya", 4, 3.7);

        // Compare Abigail and Bao
        int result = st2.compareTo(st3);
        if (result == 0) {
            System.out.println("Students are equal.");

        }
        else if (result < 0)
            System.out.println(st2.getName() + " <= " + st3.getName());
        else
            System.out.println(st3.getName() + " >= " + st3.getName());
        

        /*
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        Collections.sort(students);
        System.out.println(students); */


        /*Course course1 = new Course("CS112");
        course1.addStudent("Zack", 1, 3.5);
        course1.addStudent("Abigail", 2, 3.9);

        Course course2 = new Course("CS110");
        course2.addStudent("Bao", 3, 3.6);
        course2.addStudent("Priya", 4, 3.7);

        System.out.println(course1.compareTo(course2));
        */


    }
}
