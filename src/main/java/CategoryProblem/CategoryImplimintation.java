package CategoryProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;

public class CategoryImplimintation {

    HashMap<String,Integer> depthTracker = new HashMap<>();
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
            if(checkval.getValue().equals(parent.getParentName()))
            {
                return  Optional.of(checkval.getKey());
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

        Integer depth = 0 ;
        depthTracker.put(ParentCategory.getName(),depth);
        boolean childNotFound = false;
        Category currentparent = ParentCategory;

        while (depth==-1 && childNotFound)

        {
            Optional<Category> childelement = findChild(ParentCategory);

           if( childelement.isPresent())
            {
                depth++;
                currentparent = childelement.get();
                depthTracker.put("-".repeat(depth)+currentparent.getName(),depth);
                RemoveElement(currentparent);
                childNotFound = false;

            } else
            {
                depth--;
                if (depth==-1)
                {
                    childNotFound = true;
                    return;
                }else
                {

                }

            }

        }

    }

    public void childDerviationParent(Category ParentCategory)
    {
        List<Category> root = findRootElement();

        for (Category category : root)
        {
            childDerviation(category);
        }
    }

    public List<String> retunrvaluesback()
    {
        return returnlistvalue;
    }




}
