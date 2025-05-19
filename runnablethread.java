class myrunnable implements Runnable{
    public void run(){
        System.out.println("Runnable thread running...");
    }
}
public class runnablethread {
    public static void main(String[] args) {
        myrunnable r = new myrunnable();
        Thread t1 = new Thread(r);
        t1.start();
    }
}
