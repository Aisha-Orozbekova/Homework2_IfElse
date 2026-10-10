import java.util.Scanner;
public class TaskB {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int row1 = input.nextInt();
        int col1 = input.nextInt();
        int row2 = input.nextInt();
        int col2 = input.nextInt();

        if (row1 == row2 || col1 == col2) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
    }
}
