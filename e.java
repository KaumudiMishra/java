import java.io.File;
public class e {
    public static void main(String[] args) {
        File oldf = new File("myfile.txt");
        File newf = new File("renamedfile.txt");
        if(oldf.renameTo(newf)){
            System.out.println("done");
        }
        else{
            System.out.println("error");
        }
    }
}
