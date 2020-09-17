import java.io.File;

public class textdomo04 {
    public static void main(String[] args) {
        File file = new File("E:"+ File.separator+"demo"+File.separator+"hello"+File.separator+"text1.txt");
        print(file);
    }
    /*
    * 列出目录结构，此方法采用递归调用形式
    * @param file 要列出目录的路径
    * */
    public static void print(File file){
        if (file.isDirectory()){
         File result[]=file.listFiles();
         if (result!=null){
             for (int x= 0;x<result.length;x++){
                 print(result[x]);
             }
         }
        }
        System.out.println(file);
    }
}
