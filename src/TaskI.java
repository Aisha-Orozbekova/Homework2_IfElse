import java.util.Scanner;
public class TaskI{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("INF");
        } else if (a == 0 || b % a != 0 || (c * (-b / a) + d == 0)) {
            System.out.println("NO");
        } else {
            System.out.println(-b / a);
        }
    }
}


