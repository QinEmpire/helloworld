import java.io.*;

public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

//        method1();
//        method2();
//        method3();
        method4();

        long endTime = System.currentTimeMillis();
        System.out.println("共耗时,"+(endTime - startTime)+"毫秒");
    }

    private static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("e:\\字节流复制图片.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(("e:\\1.avi")));

        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(len);
        }
        bos.close();
        bis.close();

    }

    private static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("e:\\字节流复制图片.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(("e:\\1.avi")));

        int by;
        while ((by = bis.read())!=-1){
            bos.write(by);
        }
        bis.close();
        bos.close();

    }

    private static void method2() throws IOException {
        FileInputStream fis = new FileInputStream(("e:\\字节流复制图片.avi"));
        FileOutputStream fos = new FileOutputStream(("e:\\1.avi"));

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            fos.write(len);
        }
        fis.close();
        fos.close();
    }

    private static void method1() throws IOException {
        FileInputStream fis = new FileInputStream(("e:\\字节流复制图片.avi"));
        FileOutputStream fos = new FileOutputStream(("e:\\1.avi"));

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
