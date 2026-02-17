import java.util.*;

public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input text: ");
        String word = input.nextLine();

        StringBuilder sb = new StringBuilder();
        for(int i = word.length()-1; i>=0; i--){
            sb.append(word.charAt(i));
        }
        String reversed = sb.toString();

        System.out.println("Is Palindrome?: "+word.equals(reversed));

    }
}