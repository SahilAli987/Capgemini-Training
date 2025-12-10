import java.util.Scanner;

public class primeFactorisation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Prime Factors of " + n + ": ");

        // Print all the 2s that divide n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        // Now n must be odd → we check only odd numbers
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // If n becomes a prime number > 2
        if (n > 2) {
            System.out.print(n);
        }

        sc.close();
    }
}
