package CategoryProblem;

public class TestJavaArray {

    public static void main(String[] args) {
        String [][] fruits = {{"apple", "mango"}, {"orange", "grape"}};

        for(int idx =0 ; idx< fruits.length; idx++)
        {

            for(int jdx =0 ; jdx < fruits[idx].length; jdx++)

            System.out.println( " name is "+fruits[idx][jdx]);
        }

    }

}
