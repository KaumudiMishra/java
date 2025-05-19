class invalidageexception extends Exception {
    public invalidageexception(String msg) {
        super(msg);
    }
}

public class customexception {
    public static void checkage(int age) throws invalidageexception {
        if (age < 18) {
            throw new invalidageexception("age must be 18 or above");
        } else {
            System.out.println("you are eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkage(23);
        } catch (invalidageexception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
