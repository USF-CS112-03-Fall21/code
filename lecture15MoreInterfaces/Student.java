public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student otherStudent) {
        // Compare based on the id
        if (this.id < otherStudent.id)
            return -1;
        else if (this.id == otherStudent.id){
            return 0;        }
        else
            return 1;
        

        /*
        // Use this code instead if we want to compare based on the gpa
        if (this.gpa < otherStudent.gpa)
            return -100;
        else if (Math.abs(this.gpa - otherStudent.gpa)) < 0.01) {
            return 0;       

        }
        else
            return 100;*/
        
        // Use this code if we want to compare based on the name
        //return name.compareTo(otherStudent.name);
    }

    @Override
    public String toString() {
        return name + ": " + id +  ": " + gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }

}
