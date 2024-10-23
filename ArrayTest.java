import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        String arr[] = new String[4];
        System.out.println("total array element are: " + arr.length);
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a string");
                String name = sc.nextLine();
                arr[i] = name;

            }
        }
        String st = arr.toString();
        System.out.println(st);
    }
}
