import java.util.Scanner;
public class student {
    int id ;
    String name;
    
    student(int i, String n){
        id = i;
        name = n;
    }

    student updatename(student s){
        student t= new student(0,"null");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter new name: ");
        t.name = sc.nextLine();
        s.name = t.name;
        sc.close();
        return s;
    }

    void display(){
        System.out.println("name = "+ name +"; id = " + id);
    }

    public static void main(String[] args){
        student s1 = new student(1, "kaumudi");
        s1.display();
        s1.updatename(s1);
        s1.display();

    }
    
}
