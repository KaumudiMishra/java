import java.io.File;
public class d {
    public static void main(String[] args){
        File folder = new File("myfolder");
        if(folder.mkdir()){
            System.out.println("done");
        }
        else{
            System.out.println("error");
        }
    }
}
