import java.util.Scanner;
public class TaskJ {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int e = c - a;
        int f = d - b;

        if (f < 0) {
            e = e - 1;
            f = f + 100;
        }
        System.out.println(e + " " + f);
    }
}


