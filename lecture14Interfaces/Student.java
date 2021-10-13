public class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Student otherStudent) {
        if (this.id < otherStudent.id)
            return -1;
        else if (this.id == otherStudent.id){
            return 0;        }
        else
            return 1;
        

        //return name.compareTo(otherStudent.name);
    }

    @Override
    public String toString() {
        return name + ": " + id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
