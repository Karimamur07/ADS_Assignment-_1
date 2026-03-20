package Tasks;

public class Task_1 {
    public static void printDigits(int n) {
        if (n == 0) return;

        printDigits(n / 10); // сначала идём вглубь
        System.out.println(n % 10); // потом печатаем
    }

    public static void main(String[] args) {
        printDigits(5481);
    }
}
