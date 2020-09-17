import java.io.File;
import java.io.IOException;
/*
* 创建带路径的文件
* */
public class TextDodemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:"+File.separator+"demo"+File.separator+"hello"+File.separator+"text1.txt");
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }else {
            System.out.println(file.createNewFile());
        }
    }
}
