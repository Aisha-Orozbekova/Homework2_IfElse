import java.util.Scanner;
public class TaskU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();

        long max = Math.max(a, Math.max(b, c));
        long sum = a + b + c - max;
        long otherSquares = a * a + b * b + c * c - max * max;

        if (sum <= max) {
            System.out.println("impossible");
        } else if (max * max == otherSquares) {
            System.out.println("right");
        } else if (max * max < otherSquares) {
            System.out.println("acute");
        } else {
            System.out.println("obtuse");
        }
    }
}

