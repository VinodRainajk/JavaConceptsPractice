package CategoryProblem;

public class CategoryReturnValue {

    String name;
    String display;

    public CategoryReturnValue(String name, String display, Integer depth) {
        this.name = name;
        this.display = display;
        this.depth = depth;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    Integer depth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public CategoryReturnValue(String name, String display) {
        this.name = name;
        this.display = display;
    }
}
