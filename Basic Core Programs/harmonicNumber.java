import java.util.*;

public class harmonicNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N:");
        int n = in.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (1.0 / i);
        }
        System.out.printf("Harmonic Number of %d is %.3f", n, sum);
    }
}
