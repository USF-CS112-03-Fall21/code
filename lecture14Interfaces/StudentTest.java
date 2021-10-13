import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student st1 = new Student("Zack", 1);
        Student st2 = new Student("Abigail", 2);
        Student st3 = new Student("Bao", 3);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        Collections.sort(students);
        System.out.println(students);

    }
}
