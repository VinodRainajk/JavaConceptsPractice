package ExceptionHandelingPractice.Inheritance;

import ExceptionHandelingPractice.CustomException.InvalidFileNameCustom;

public class ParentClassCar {

    public void driveCar() throws  InvalidFileNameCustom
      {
          System.out.println("Parent Car ClassDrive method");
            throw new InvalidFileNameCustom("Driving Error");
      }
}
