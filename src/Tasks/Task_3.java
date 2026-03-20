package Tasks;

public class Task_3 {
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return true;
        if (n % i == 0) return false;
        if (i * i > n) return true;

        return isPrime(n, i + 1);
    }
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 10;
        System.out.println((isPrime(num1, 2) ? "Prime" : "Composite"));
        System.out.println((isPrime(num2, 2) ? "Prime" : "Composite"));
    }
}