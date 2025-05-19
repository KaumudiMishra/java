public class mythreadc extends Thread {
    public void run(){
        try{
            for (int i = 1; i < 6; i++) {
                System.out.println("user thread: "+ i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("thread interupted");
        }
    }
    public static void main(String[] args){
        mythreadc userthread = new mythreadc();
        userthread.start();
        try{
            for (int i = 1; i < 6; i++) {
                System.out.println("main thread: "+ i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(" main thread interupted");
        }
    }
}
