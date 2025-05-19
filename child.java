class parent {
    int x;

    parent(int x) {
        this.x = x;
    }

    void display() {
        System.out.println("parent x = " + x);
    }
}

class child extends parent {
    int y;

    child(int x, int y) {
        super(x);
        this.y = y;
    }

    void show() {
        this.display();
        System.out.println("child y = " + this.y);
    }

    public static void main(String[] args) {
        child obj = new child(10, 20);
        obj.show();
    }
}