public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // The position of the Fibonacci number to calculate

        // Print the Fibonacci number at position n
        System.out.println("Fibonacci number at position " + n + ": " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}