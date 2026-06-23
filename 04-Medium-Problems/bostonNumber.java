package basic;
import java.util.*;

public class bostonNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        int result = PrimeFactorSum(n);

        System.out.println("Sum of digits of prime factors = " + result);

        sc.close();
    }

    public static int PrimeFactorSum(int n) {
        int i = 2;
        int sum = 0;

        System.out.print("Prime Factors: ");

        while (n > 1) {
            if (n % i == 0) {
                System.out.print(i + " "); // print factor
                n = n / i;
                sum = sum + sumOfDigits(i);
            } else {
                i++;
            }
        }

        System.out.println();
        return sum;
    }
    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld;
            n = n / 10;
        }

        return sum;
    }
}