package CategoryProblem;

public class java8InterfaceImpl implements Java8Interface{

    public static void main(String[] args) {
        System.out.println("Inside the  java8InterfaceImpl");
        java8InterfaceImpl imp = new java8InterfaceImpl() ;
        imp.defaultmethod();
        Java8Interface.staticMethod();
    }

    @Override
    public void defaultmethod()
    {
        System.out.println("This is the Default method in class");
    }


}
