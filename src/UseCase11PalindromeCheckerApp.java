import java.util.*;

class PalindromeChecker {
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String str = input.nextLine();
        
        PalindromeChecker checker = new PalindromeChecker();
        boolean isPalindrome = checker.checkPalindrome(str);
        
        System.out.println("Is Palindrome? : " + isPalindrome);
        
        input.close();
    }
}