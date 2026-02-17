import java.util.*;

public class UseCase5PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Input text: ");
        String word = input.nextLine();

        char[] words = word.toCharArray();
        boolean isPalindrome = true;

        for(char c : words){
            stack.push(c);
        }

        for(char c : words){
            if(c != stack.peek()){
                isPalindrome = false;
                break;
            }
            stack.pop();
        }

        System.out.println("Is Palindrome?: "+isPalindrome);
    }
}