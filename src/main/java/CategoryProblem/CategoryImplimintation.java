package CategoryProblem;

import java.sql.SQLOutput;
import java.util.*;
import java.util.Map.Entry;

public class CategoryImplimintation {
    List<String> returnlistvalue =  new ArrayList<>();
    HashMap<Category,String> CategoryHashmap = new HashMap<>();
    Set<String> elementadded = new HashSet<>();
    HashMap<String,Category> AllCategory = new HashMap<>();
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
            System.out.println("CurrentCategory "+currentparent);
            Optional<Category> childelement = findChild(currentparent);

           if( childelement.isPresent())
            {
                System.out.println("\"-\".repeat(depth)+currentparent.getName() "+"-".repeat(depth)+currentparent.getName());
             if (!elementadded.contains(currentparent.getName()))
             {
                 returnlistvalue.add("-".repeat(depth)+currentparent.getName());
                 elementadded.add(currentparent.getName());
             }

                depth++;
                currentparent = childelement.get();
                System.out.println("Hash map is "+ CategoryHashmap);
                childNotFound = false;


            } else
            {

                if (depth==-1)
                {
                    childNotFound = true;
                    break;
                }else
                {
                    System.out.println("Last child ");
                    System.out.println("currentparent.getName() " +currentparent.getName());
                    System.out.println("ParentCategory.getName() " +ParentCategory.getName() );
                   if(!elementadded.contains(currentparent.getName()))
                   {
                       System.out.println("This is already printed ");
                       returnlistvalue.add("-".repeat(depth)+currentparent.getName());
                       elementadded.add(currentparent.getName());
                       System.out.println("\"-\".repeat(depth)+currentparent.getName() "+"-".repeat(depth)+currentparent.getName());
                   }
                    RemoveElement(currentparent);
                    currentparent = AllCategory.get(currentparent.getParentName());
                    depth--;

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
        AllCategory.put(categoryDummyData.generateData().get(idx).getName(), categoryDummyData.generateData().get(idx));
        if(categoryDummyData.generateData().get(idx).getParentName()!= null)
        {
            CategoryHashmap.put(categoryDummyData.generateData().get(idx), categoryDummyData.generateData().get(idx).getParentName());
        }

    }
}


}
