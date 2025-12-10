import java.util.*;

public class quoRem {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int dividend = in.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = in.nextInt();

        int quotient = (int) dividend / divisor;
        int remainder = (int) dividend % divisor;

        System.out.println("Quotient: " + quotient + "\nRemainder: " + remainder);

    }
}
