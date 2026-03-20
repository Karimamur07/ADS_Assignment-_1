package Tasks;

public class Task_4 {
    public static int fact(int n) {
    if (n == 1) return 1;

    return n * fact(n - 1);
    }
    public static void main(String[] args){
        int n = 5;
        int factorial = fact(n);
        System.out.println(factorial);
    }
}
