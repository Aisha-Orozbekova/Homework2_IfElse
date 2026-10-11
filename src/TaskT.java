import java.util.Scanner;
public class TaskT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println(x1 + " " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);

            if (x == 0) {
                System.out.println(0);
            } else {
                System.out.println(x);
            }

        }
    }
}
