import java.util.Scanner;
public class TaskM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        if ((x1 > 0) == (x2 > 0) && (y1 > 0) == (y2 > 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}