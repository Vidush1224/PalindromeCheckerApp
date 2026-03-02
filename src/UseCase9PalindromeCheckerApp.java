import java.util.*;

public class UseCase9PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        String str = input.nextLine();

        boolean isPalindrome = check(str, 0, str.length() - 1);

        System.out.println("Is Palindrome? : " + isPalindrome);

        input.close();
    }

    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }
}