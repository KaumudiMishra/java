public class changename {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("Original name: " + Thread.currentThread().getName());
                    Thread.sleep(5000);
                    Thread.currentThread().setName("Renamed-Thread");
                    System.out.println("New name: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        });
        t.start();
    }

}
