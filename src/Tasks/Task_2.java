package Tasks;

public class Task_2 {
    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;

        return arr[n - 1] + sum(arr, n - 1);
    }

    public static double avg(int[] arr, int n) {
        return (double) sum(arr, n) / n;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3, 2, 4, 1};
        double average = avg(arr,n);
        System.out.println(average);
    }
}