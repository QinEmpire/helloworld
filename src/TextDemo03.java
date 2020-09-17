import java.io.File;

public class TextDemo03 {
    public static void main(String[] args) {
        File file = new File("E:"+ File.separator+"demo"+File.separator+"hello");
        if (file.exists()){
            System.out.println("是否是文件"+(file.isFile()));
            System.out.println("是否是目录"+(file.isDirectory()));
        }
    }
}
