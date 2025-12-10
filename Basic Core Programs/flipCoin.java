import java.util.*;

public class flipCoin {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times to flip coin");
        int n = in.nextInt();
        int heads = 0, tails = 0;
        for (int i = 0; i < n; i++) {
            double rand = Math.random();
            System.out.println(rand);

            if (rand < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }
        double tailPercent = ((double) tails / n) * 100;
        double headPercent = ((double) heads / n) * 100;
        System.out.println("Percentage of Tails = " + tailPercent);
        System.out.println("Percentage of Heads = " + headPercent);
    }

}
