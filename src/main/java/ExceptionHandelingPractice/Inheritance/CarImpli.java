package ExceptionHandelingPractice.Inheritance;

import ExceptionHandelingPractice.CustomException.InvalidFileNameCustom;

public class CarImpli {

    public static void main(String[] args) throws InvalidFileNameCustom {
        ChildClassMerc ChildClassMerc = new ChildClassMerc();
        ChildClassMerc.driveCar();
    }
}
