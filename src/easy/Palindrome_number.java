package easy;

public class Palindrome_number {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(686);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int x) {
        int rev = 0;
        int num = x;
        if (Math.abs(x) != x) {
            return false;
        } else {
            while (num != 0) {
                int pop = num % 10;
                num /= 10;
                rev = rev * 10 + pop;
            }
            if (x == rev) {
                return true;
            } else
                return false;
        }
    }
}

