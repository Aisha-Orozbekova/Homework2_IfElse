import java.util.Scanner;
public class TaskAB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        String result = "";

        if (x == 100) {
            result = "C";
        } else {
            int tens = x / 10;
            int ones = x % 10;

            if (tens == 9) {
                result += "XC";
            } else if (tens >= 5) {
                result += "L";
                for (int i = 0; i < tens - 5; i++) {
                    result += "X";
                }
            } else if (tens == 4) {
                result += "XL";
            } else {
                for (int i = 0; i < tens; i++) {
                    result += "X";
                }
            }

            if (ones == 9) {
                result += "IX";
            } else if (ones >= 5) {
                result += "V";
                for (int i = 0; i < ones - 5; i++) {
                    result += "I";
                }
            } else if (ones == 4) {
                result += "IV";
            } else {
                for (int i = 0; i < ones; i++) {
                    result += "I";
                }
            }
        }

        System.out.println(result);

        input.close();
    }
}
