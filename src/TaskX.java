import java.util.Scanner;
public class TaskX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int sixty = n / 60;
        int rest = n % 60;

        int bestCost = Integer.MAX_VALUE;
        int bestTrips = -1;

        int bestOne = 0;
        int bestFive = 0;
        int bestTen = 0;
        int bestTwenty = 0;
        int extraSixty = 0;

        for (int twenty = 0; twenty <= 2; twenty++) {
            for (int ten = 0; ten <= 5; ten++) {
                for (int five = 0; five <= 8; five++) {

                    int covered = twenty * 20
                            + ten * 10
                            + five * 5;

                    int one = Math.max(0, rest - covered);

                    int trips = covered + one;

                    int cost = twenty * 230
                            + ten * 125
                            + five * 70
                            + one * 15;

                    if (cost < bestCost ||
                            (cost == bestCost && trips > bestTrips)) {

                        bestCost = cost;
                        bestTrips = trips;

                        bestOne = one;
                        bestFive = five;
                        bestTen = ten;
                        bestTwenty = twenty;
                    }
                }
            }
        }

        if (440 < bestCost ||
                (440 == bestCost && 60 > bestTrips)) {

            bestOne = 0;
            bestFive = 0;
            bestTen = 0;
            bestTwenty = 0;
            extraSixty = 1;
        }

        System.out.println(
                bestOne + " " +
                        bestFive + " " +
                        bestTen + " " +
                        bestTwenty + " " +
                        (sixty + extraSixty)
        );

        input.close();
    }
}