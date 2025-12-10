import java.util.*;

public class powerOfTwo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = in.nextInt();
        while (n > 31) {
            System.out.println("Please enter N less than or equal to 31: ");
            n = in.nextInt();
        }
        for (int i = 0; i <= n; i++) {
            int power = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + power);
        }
    }
}
