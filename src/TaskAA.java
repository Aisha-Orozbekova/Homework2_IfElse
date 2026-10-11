import java.util.Scanner;
public class TaskAA {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        if ((A % 2 == 0 || B % 2 == 0 || C % 2 == 0) &&
            (A % 2 != 0 || B % 2 != 0 || C % 2 != 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        input.close();
    }
}
