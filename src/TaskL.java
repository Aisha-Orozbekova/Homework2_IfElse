import java.util.Scanner;
public class TaskL {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int k = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();

        if (n <= k) {
            System.out.println(2 * m);
        } else {
            int time = ((2 * n + k - 1) / k) * m;
            System.out.println(time);
        }
    }
}