import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("e:\\窗里窗外.txt");

        byte[] bys = new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
    fis.close();

    }
}
