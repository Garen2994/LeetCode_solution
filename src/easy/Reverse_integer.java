package easy;

public class Reverse_integer {
    public static void main(String[] args) {
        int reverse = reverse(-625);
        System.out.println(reverse);
    }
    public static int reverse(int x) {
        long num = x;
        long result = 0;

        while (num != 0) {
            long pop = num % 10;
            num /= 10;

            //Attention
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            result = result * 10 + pop;
        }
        return (int) result;
    }
}