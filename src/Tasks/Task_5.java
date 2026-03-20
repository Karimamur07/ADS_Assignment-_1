package Tasks;

public class Task_5 {
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 17;
        System.out.println(fib(num1));
        System.out.println(fib(num2));
    }
}
