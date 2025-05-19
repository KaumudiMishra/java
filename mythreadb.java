// b) Java Program: Thread sleeps for 6 seconds in a loop from 5 to 1, changing name
public class mythreadb extends Thread {
   public void run(){
    try{
        for (int i = 5; i > 0; i--) {
            Thread.currentThread().setName("Countdown-" + i);
            System.out.println("Thread name: "+ Thread.currentThread());
            Thread.sleep(6000);
        }
        System.out.println("completed countdown");
    }
    catch (InterruptedException e){
        System.out.println("thread interupted");
    }
   } 
   public static void main(String[] args) {
    mythreadb t = new mythreadb();
    t.start();
   }
}
