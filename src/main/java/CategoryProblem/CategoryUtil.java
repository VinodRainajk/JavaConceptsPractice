package CategoryProblem;

import java.util.List;

public class CategoryUtil {

    public static void main(String[] args) {
        CategoryImplimintation categoryImplimintation = new CategoryImplimintation();
        List<String> valuereceived =  categoryImplimintation.retunrvaluesback();
        for (int idx =0; idx< valuereceived.size(); idx++)
        {
            System.out.println(valuereceived.get(idx));
        }
    }
}
