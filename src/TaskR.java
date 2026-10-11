import java.util.Scanner;
public class TaskR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == b && b == c) {
            System.out.println(3);
        } else if (a == b || a == c || b == c) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}