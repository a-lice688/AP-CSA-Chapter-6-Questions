import java.util.Scanner;

public class binary {
    
    public static void main (String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please input an integer: ");
        int input = s.nextInt();
        
        if (input == 0) System.out.print("The binary of 0 is 0.");
        
        while (input < 0) {
            
            System.out.print("Try again: ");
            input = s.nextInt();
            
        }
        
        System.out.print("The binary of " + input + " is " + convertToBinary(input));
        
    }
    
    public static String convertToBinary(int num) {
        
        String results = "";
        
        if (num <= 1) return Integer.toString(num);
        
        //else return (num % 2) + convertToBinary(num / 2); 
        
        while (num >= 2) {
            
            results += num % 2;
            
            num /= 2;
            
        }
    
        
        return results += num;
    }
}



