import java.io.*;

public class ConversionSteamDemo {
    public static void main(String[] args) throws IOException {
        /*OutputStreamWriter osw  = new OutputStreamWriter(new FileOutputStream("e:\\2.txt"));
        osw.write("中国");
        osw.close();*/

        InputStreamReader isr = new InputStreamReader(new FileInputStream("e:\\2.txt"));
        int len;
        while ((len=isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();


    }
}
