package Tasks;

public class Task_9 {
    public static int length(String s) {
        if (s.equals("")) return 0;

        return 1 + length(s.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(length("hello"));
        System.out.println(length("recursion"));
    }
}
