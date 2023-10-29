package CategoryProblem;

import java.util.Comparator;

public class CUstomStudentCOmparable implements Comparator<CustomStudent> {
    @Override
    public int compare(CustomStudent student1, CustomStudent student2) {
        return Integer.compare(student1.id, student1.id);
    }


}
