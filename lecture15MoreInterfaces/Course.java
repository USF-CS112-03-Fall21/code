import java.util.ArrayList;

public class Course { // FILL IN CODE: needs to implement Comparable<Course>
	private String courseTitle;
	private ArrayList<Student> students;

	public Course(String courseTitle) {
		this.courseTitle = courseTitle;
		students = new ArrayList<>();
	}

	public void addStudent(String name, int id, double gpa) {
		Student st = new Student(name, id, gpa);
		students.add(st);
	}

	

	// FILL IN CODE: need to implement compareTo 
	// compareTo should compare Courses based on the number of students
	// if the number of students are equal, 
	// it should compare based on the # of  high performing students - students with GPA > 3.5


}