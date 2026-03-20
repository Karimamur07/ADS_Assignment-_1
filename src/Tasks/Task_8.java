package Tasks;

public class Task_8 {
    public static String isAllDigits(String s) {
        if (s.length() == 0) {
            return "Yes";
        }
        if (!Character.isDigit(s.charAt(0))) {
            return "No";
        }
        return isAllDigits(s.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(isAllDigits("123456"));
        System.out.println(isAllDigits("123a12"));
    }
}