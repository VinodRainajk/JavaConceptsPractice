package CategoryProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentImpl {

    public static void main(String[] args) {
        List<Student> studentlist = new ArrayList<>();
        Collections.sort(studentlist);


        List<CustomStudent> CustomStudentlist = new ArrayList<>();
        CUstomStudentCOmparable custCOmparator = new CUstomStudentCOmparable();
        Collections.sort(CustomStudentlist,custCOmparator);
    }

}
