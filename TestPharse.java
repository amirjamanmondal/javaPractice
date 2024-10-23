import java.util.Scanner;

public class TestPharse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number:");
        int i = sc.nextInt();
        // System.out.println("Enter a Double:");
        // sc.nextLine();
        double d = sc.nextDouble();
        // System.out.println("Enter a String:");
        sc.nextLine();
        String s = sc.nextLine();
        sc.close();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
