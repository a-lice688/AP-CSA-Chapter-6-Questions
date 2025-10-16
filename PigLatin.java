import java.util.Scanner;

public class PigLatin {
    
    public static void main (String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Input: ");
        String input = s.nextLine();
        
        System.out.print("The Pig Latin of " + input + " is " + pigLatin(input));
        
    }
    
    public static String pigLatin (String msg) {
        
        String[] words = msg.split(" ");
        String result = "";
        
        for (int i = 0; i < words.length; i++) {
            
            result += conversion(words[i]);
            
            if (i < words.length - 1) result += " ";
                
        }
        
        return result;
    }
    
    public static String conversion (String word) {
        
        String result = "";
        
        if (word.length() <= 2) return word; 
            
        else {
            String first = word.substring(0, 1);
            
            String rest = word.substring(1);
            
            return rest + first + "ay";
        }
        
    }
    
}
