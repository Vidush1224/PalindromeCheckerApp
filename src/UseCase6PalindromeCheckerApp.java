import java.util.*;

public class UseCase6PalindromeCheckerApp {
    public static void main(String[] args){
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        System.out.print("Input text: ");
        Scanner input = new Scanner(System.in);
        boolean isPalindrome = true;

        String word = input.nextLine();
        char[] words = word.toCharArray();

        for(char c : words){
            queue.add(c);
            stack.push(c);
        }

        while(!queue.isEmpty()){
            if(queue.remove() != stack.pop()){
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome?: "+isPalindrome);
    }
}