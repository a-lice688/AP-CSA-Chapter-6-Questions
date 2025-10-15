import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        
        if (isPalindrome(input)) System.out.println("This is a palindrome.");
        else System.out.println("This is not a palindrome.");
        
        }

    public static boolean isPalindrome(String str) {
        String nonLetters = ",.:;()[]{}!@#$%^&* \"";
        String clean = "";

        for (int i = 0; i < str.length(); i++) {
            String c = str.substring(i, i + 1);
            
            if (!nonLetters.contains(c))
                clean += c.toLowerCase();
                
        }

        int start = 0, end = clean.length() - 1;
        
        while (start < end) {
            
            if (clean.charAt(start) != clean.charAt(end)) return false;
            
            start++;
            end--;
            
        }
        
        return true;
    }
    
}
