package CategoryProblem;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

public class CategoryImplimintation {

    List <CategoryReturnValue> depthTracker = new ArrayList<>();
    List<String> returnlistvalue =  new ArrayList<>();
    HashMap<Category,String> CategoryHashmap = new HashMap<>();

    public List<Category> findRootElement()
    {
        List<Category> returnList = new ArrayList<>();
        returnList.add(new Category("Electic",null));
        returnList.add(new Category("Chair",null));
        return returnList;
    }

    public Optional<Category> findChild(Category parent)
    {
        for(Entry<Category,String> checkval :  CategoryHashmap.entrySet())
        {
           // System.out.println("checkval.getValue() " +checkval.getValue());
            if(checkval.getValue()!=null)
            {
                System.out.println("checkval.getValue() " +checkval.getValue());
                System.out.println("parent.getParentName()" +parent.getName());
                if(checkval.getValue().equals(parent.getName()))
                {
                    System.out.println("return this");
                    return  Optional.of(checkval.getKey());
                }
            }


        }
        return Optional.empty();
    }

    public boolean RemoveElement(Category category)
    {
        CategoryHashmap.remove(category);
        return true;
    }

    public void childDerviation(Category ParentCategory)
    {
        System.out.println("ParentCategory "+ParentCategory.getName());
        Integer depth = 0 ;
        //depthTracker.put(ParentCategory.getName(),depth);
        boolean childNotFound = false;
        Category currentparent = ParentCategory;

        while (depth!=-1 && !childNotFound)

        {
            System.out.println("depth "+depth);
            System.out.println("childNotFound "+childNotFound);
            Optional<Category> childelement = findChild(ParentCategory);

           if( childelement.isPresent())
            {
                System.out.println("\"-\".repeat(depth)+currentparent.getName() "+"-".repeat(depth)+currentparent.getName());
                depth++;
                currentparent = childelement.get();
                depthTracker.add( new CategoryReturnValue(currentparent.getName(), "-".repeat(depth)+currentparent.getName(),depth));
                returnlistvalue.add("-".repeat(depth)+currentparent.getName());
                RemoveElement(currentparent);
                childNotFound = false;

            } else
            {

                if (depth==0)
                {
                    childNotFound = true;
                    break;
                }else
                {
                    while (depthTracker.get(depthTracker.size()-1).getDepth()==depth+1)
                    {
                        depthTracker.remove(depthTracker.size()-1);
                    }

                    depth =  depth+1;

                }

            }

        }

    }

    public void childDerviationParent()
    {
        System.out.println("Inside childDerviationParent");
        List<Category> root = findRootElement();

        for (Category category : root)
        {
            System.out.println("category "+category.getName());
            childDerviation(category);
        }
    }

    public List<String> retunrvaluesback()
    {
        System.out.println("Inside retunrvaluesback");
        populatevalue();
        childDerviationParent();

        return returnlistvalue;
    }

public void populatevalue()
{
    System.out.println("Inside populatevalue");
    CategoryDummyData categoryDummyData = new CategoryDummyData();
    for(int idx =0; idx< categoryDummyData.generateData().size() ; idx++)
    {
        CategoryHashmap.put(categoryDummyData.generateData().get(idx), categoryDummyData.generateData().get(idx).getParentName());
    }
}


}
