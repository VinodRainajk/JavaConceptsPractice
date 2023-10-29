package CategoryProblem;

public interface Java8Interface {

    default void defaultmethod()
    {
        System.out.println("This is the Default method");
    }

    static void staticMethod()
    {
        System.out.println("This is the staticMethod method");
    }

}
