package ExceptionHandelingPractice.CustomException;

public class CustomExceptionUtil {

    public static void main(String[] args) throws InvalidFileNameCustom{

        String name = "FilenameisLongggggggggggggg";

        FileNameBusinessImpl fileNameBusiness = new FileNameBusinessImpl();
        try {
            fileNameBusiness.FileNamemethod(name);


        } catch (InvalidFileNameCustom exp) {
           // throw new InvalidFileNameCustom(name); -- this does not priovide the cause of the exception
            throw new InvalidFileNameCustom(name, exp);

        }
    }
}