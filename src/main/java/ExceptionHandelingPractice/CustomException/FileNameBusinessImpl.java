package ExceptionHandelingPractice.CustomException;

public class FileNameBusinessImpl {

    public void FileNamemethod(String fileName) throws InvalidFileNameCustom
    {
        throw new InvalidFileNameCustom(fileName);
    }
}
