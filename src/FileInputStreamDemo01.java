import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream  fis = new FileInputStream("e:\\fos.txt");
        int by= fis.read();
        System.out.println(by);
        int by1 ;
        while((by1=fis.read())!=-1){
            System.out.println((char) by1);
        }
        fis.close();
    }
}
