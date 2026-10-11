import java.util.Scanner;
public class TaskS {
    public static void main (String [] args) {
        Scanner input = new  Scanner (System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        if (dx <= 1 && dy <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
