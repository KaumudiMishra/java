import java.io.FileWriter;
import java.io.IOException;
public class filehandling {
   public static void main(String[] args) {
    try{
        FileWriter writer = new FileWriter("myfile.txt");
        writer.write("hello world this is file handling");
        writer.close();
        System.out.println("created and written successfully");
    }
    catch(IOException e){
        System.out.println("error occured");
    }
   } 
}
