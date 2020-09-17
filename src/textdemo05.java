import java.io.*;

public class textdemo05 {
    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("e:"+File.separator+"fos.txt");
        fos.write(97);
        fos.write(57);
        fos.write(55);

        byte[] bys  = {97,98,99,100,101};
        fos.write(bys);
        fos.write(bys,1,3);
        fos.close();

    }
}
