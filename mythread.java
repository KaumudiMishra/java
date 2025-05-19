// a) Java Program: Thread sleeps for 5 seconds and changes its name
public class mythread extends Thread {
    public void run(){
        try{
            System.out.println("original name : " + Thread.currentThread().getName());
            Thread.currentThread().setName("SleepingThread");
            System.out.println("Thread name changed to: " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("Thread woke up after 5 seconds.");
            Thread.currentThread().setName("AwakeThread");
            System.out.println("Thread name changed to: " + Thread.currentThread().getName());
        }
        catch(InterruptedException e){
            System.out.println("Thread interupted");
        }
    }
    public static void main(String[] args){
            mythread t = new mythread();
            t.start();
        }
}

