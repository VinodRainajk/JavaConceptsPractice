package CategoryProblem;

public class Student implements Comparable<Student> {
    int id;
    String Name;


    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.id,this.id);
    }
}
