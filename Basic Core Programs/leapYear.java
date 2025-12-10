
import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a four digit number");
        int n = in.nextInt();

        while (n < 1000 || n > 9999) {
            System.out.print("Enter a valid  digit number: ");
            n = in.nextInt();
        }

        if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)) {
            System.out.println("It is a Leap Year");
        } else {
            System.out.println("It is not a Leap Year");
        }
    }
}