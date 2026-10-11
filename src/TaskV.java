import java.util.Scanner;
public class TaskV {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        int last = n % 10;

        if (n >= 11 && n <= 14) {
            System.out.println(n + " korov");
        } else if (last == 1) {
            System.out.println(n + " korova");
        } else if (last >= 2 && last<= 4) {
            System.out.println(n + " korovy");
        } else {
            System.out.println(n + " korov");
        }
    }
}
