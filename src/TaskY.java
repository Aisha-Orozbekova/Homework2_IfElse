import java.util.Scanner;
public class TaskY {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int M = input.nextInt();
        int N = input.nextInt();
        int x = input.nextInt();
        int y = input.nextInt();

        if (x > 1) {
            System.out.println((x - 1) + " " + y);
        }
        if (x < M) {
            System.out.println((x + 1) + " " + y);
        }
        if (y > 1) {
            System.out.println(x + " " + (y - 1));
        }
        if (y < N) {
            System.out.println(x + " " + (y + 1));
        }

        input.close();
    }
}
