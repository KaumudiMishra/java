class counter {
    static int count = 0;

    counter() {
        count++;
    }

    void display() {
        System.out.println("obj created so far : " + count);
    }

    public static void main(String[] args) {
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();
        counter c5 = new counter();
        c1.display();
        c2.display();
        c3.display();
        c5.display();

    }
}
