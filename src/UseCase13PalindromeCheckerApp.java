import java.util.*;

public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input: ");
        String str = input.nextLine();
        
        long startTime = System.nanoTime();
        
        boolean isPalindrome = checkPalindrome(str);
        
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
        
        input.close();
    }
    
    public static boolean checkPalindrome(String input) {
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