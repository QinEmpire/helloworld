import java.io.File;
import java.io.IOException;
/*
* 文件操作流程
* */
public class TextDemo {
    public static void main(String[] args) {
        File file = new File("E:"+File.separator+"text.txt");
        if(file.exists()){
            file.delete();
        }else {
            try {
                System.out.println(file.createNewFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
