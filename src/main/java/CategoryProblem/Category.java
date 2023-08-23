package CategoryProblem;

public class Category {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Category() {
    }

    public String getParentName() {
        return ParentName;
    }

    public void setParentName(String parentName) {
        ParentName = parentName;
    }

    String Name;

    public Category(String name, String parentName) {
        Name = name;
        ParentName = parentName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "Name='" + Name + '\'' +
                ", ParentName='" + ParentName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Category input = (Category)obj;
        return Name.equals(input.getName());
    }

    String ParentName;
}
