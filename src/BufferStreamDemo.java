import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
    /*    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e:\\fos.txt"));
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        bos.close();*/
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("e:\\fos.txt"));
      /*  int by ;
        while((by = bis.read())!=-1){
            System.out.println((char)by);
        }*/
      byte[] bys = new byte[1024];
      int len;
      while ((len=bis.read(bys))!=-1){
          System.out.println(new String(bys,0,len));
      }
        bis.close();
    }

}
