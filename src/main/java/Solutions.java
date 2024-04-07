import java.util.Scanner;

public class Solutions {

    public static int findMinimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMinimum(arr, n - 1));
    }
    // Complexity: O(n)

    public static double findAverage(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return (arr[n - 1] + (n - 1) * findAverage(arr, n - 1)) / (double) n;
    }
    // Complexity: O(n)

    public static boolean isPrime(int n, int divisor) {
        if (n <= 2) {
            return n == 2;
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return isPrime(n, divisor + 1);
    }

    public static boolean isPrime(int n) {
        return isPrime(n, 2);
    }
    // Complexity: O(sqrt(n))

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // Complexity: O(n)

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    // Complexity: O(2^n)

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
    // Complexity: O(n)

    public static void permutations(String s, String current) {
        if (s.length() == 0) {
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            permutations(s.substring(0, i) + s.substring(i + 1), current + s.charAt(i));
        }
    }
    // Complexity: O(n!)

    public static boolean isAllDigits(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (!Character.isDigit(s.charAt(0))) {
            return false;
        }
        return isAllDigits(s.substring(1));
    }
    // Complexity: O(n)

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
    // Complexity: O(2^n)

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    // Complexity: O(log(min(a, b)))

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(findMinimum(arr, n));
        System.out.println(findAverage(arr, n));

        int num = scanner.nextInt();
        System.out.println(isPrime(num));

        int factNum = scanner.nextInt();
        System.out.println(factorial(factNum));

        int fibNum = scanner.nextInt();
        System.out.println(fibonacci(fibNum));

        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        System.out.println(power(base, exponent));

        String str = scanner.next();
        permutations(str, "");

        String checkStr = scanner.next();
        System.out.println(isAllDigits(checkStr));

        int nk = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(binomialCoefficient(nk, k));

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(gcd(num1, num2));

        scanner.close();
    }
}
