import java.util.*;

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {
        System.out.print("Input Text: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome?: "+ isPalindrome);
    }
}
