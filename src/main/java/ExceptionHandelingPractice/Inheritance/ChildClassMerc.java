package ExceptionHandelingPractice.Inheritance;

import ExceptionHandelingPractice.CustomException.InvalidFileNameCustom;

public class ChildClassMerc extends ParentClassCar{

    @Override
    public void driveCar() throws InvalidFileNameCustom
    {
        System.out.println("child Car ClassDrive method");
        throw new InvalidFileNameCustom("Driving Error");
    }
}
