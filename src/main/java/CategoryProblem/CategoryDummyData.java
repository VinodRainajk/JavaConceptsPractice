package CategoryProblem;

import java.util.ArrayList;
import java.util.List;

public class CategoryDummyData {

    public List<Category> generateData()
    {
        List<Category> returnList = new ArrayList<>();
        returnList.add(new Category("Electic",null));
        returnList.add(new Category("Tv","Electic"));
        returnList.add(new Category("LG","Tv"));
        returnList.add(new Category("samsung","Tv"));
        returnList.add(new Category("Fridge","Electic"));
        returnList.add(new Category("Allwyn","Fridge"));
        returnList.add(new Category("Wirlpool","Fridge"));
        returnList.add(new Category("grill","Electic"));
        returnList.add(new Category("oven","grill"));
        returnList.add(new Category("toaster","grill"));
        returnList.add(new Category("toaster","prestige"));
        returnList.add(new Category("Chair",null));
        returnList.add(new Category("Neelkamal","Chair"));
        return returnList;

    }
}
