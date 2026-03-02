import java.util.*;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        String str = input.nextLine();

        String normalized = str.toLowerCase().replaceAll("\\s+", "");

        boolean isPalindrome = true;

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);

        input.close();
    }
}
