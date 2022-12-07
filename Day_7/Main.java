import java.util.Scanner;

/**
 * Main
 */
public class Main {

    private static long factorialRecursive(int number) {
        long rs = 1;
        for (int i = 2; i <= number; i++) {
            rs *= i;
        }
        return rs;
    }

    private static long factorialIterative(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorialRecursive(number - 1);
        }
    }

    // Scanner
    public static Scanner sc = new Scanner(System.in);

    public static int enterPositive() {
        int tmp;
        do {
            System.out.println("Enter number: ");
            tmp = sc.nextInt();
        } while (tmp <= 0);
        return tmp;
    }

    public static void main(String[] args) {
        long resultByInterative, resultByRecursive;
        int n = enterPositive();
        resultByInterative = factorialIterative(5);
        System.out.println("resultByInterative: " + resultByInterative);
        resultByRecursive = factorialRecursive(5);
        System.out.println("resultByRecursive: " + resultByRecursive);

    }

}