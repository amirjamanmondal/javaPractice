import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            // Complete this line
            String s1 = sc.next();
            int x = sc.nextInt();

            System.out.println(String.format("%-15s", s1) + "" + String.format("%03d", x));

        }
        System.out.println("================================");

    }
}