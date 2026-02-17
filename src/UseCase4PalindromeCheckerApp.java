import java.util.*;

public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input text: ");
        String word = input.nextLine();

        char[] words = word.toCharArray();

        int start = 0;
        int end = words.length-1;
        boolean isPalindrome = true;

        while(start<end){
            if(words[start] != words[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is Palindrome?: "+isPalindrome);
    }
}