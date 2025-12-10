import java.util.*;

public class swapNum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int first = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int second = in.nextInt();

        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("First: " + first + "\nSecond: " + second);

    }
}
