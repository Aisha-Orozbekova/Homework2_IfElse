import java.util.Scanner;
public class TaskK {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        int k = input.nextInt();
        if (k == 1 || k == 2 || k == 4 || k == 7) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}

