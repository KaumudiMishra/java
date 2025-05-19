import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int c = n;
        int r = 0;
        while (n != 0) {
            int t = n % 10;
            r = r * 10 + t;
            n = n / 10;
        }
        if (c == r)
            System.out.println("palindrome number");
        else
            System.out.println("not palindrome");
        sc.close();
    }
}