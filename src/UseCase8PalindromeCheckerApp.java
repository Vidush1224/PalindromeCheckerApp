import java.util.*;

public class UseCase8PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input : ");
        String str = input.nextLine();
        
        LinkedList<Character> list = new LinkedList<>();
        
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        
        boolean isPalindrome = true;
        
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();
            
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println("Is Palindrome? : " + isPalindrome);
        
        input.close();
    }
}