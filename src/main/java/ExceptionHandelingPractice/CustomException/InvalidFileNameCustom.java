package ExceptionHandelingPractice.CustomException;

public class InvalidFileNameCustom extends Exception {

    public InvalidFileNameCustom(String errorname)
    {
        super(errorname);
    }


    public InvalidFileNameCustom(String errorname,Throwable ERR)
    {
        super(errorname,ERR);
    }
}
