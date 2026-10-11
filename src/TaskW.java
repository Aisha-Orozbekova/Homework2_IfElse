import java.util.Scanner;
public class TaskW {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        int sixty = n / 60;
        int rest = n % 60;

        int ten = rest / 10;
        int one = rest % 10;

        if (one * 15 >= 125) {
            ten = ten + 1;
            one = 0;
        }

        if (ten * 125 + one * 15 >= 440) {
            sixty = sixty + 1;
            ten = 0;
            one = 0;
        }

        System.out.println(one + " " + ten + " " + sixty);
    }
}
