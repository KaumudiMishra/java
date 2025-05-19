class mythread extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }
}

public class multithreading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            mythread t1 = new mythread();
            t1.start();
        }

    }
}