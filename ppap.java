import java.util.Scanner;

public class ppap {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        
        System.out.println(ppap(input));
    }

    public static String ppap(String str) {
        int comma = str.indexOf(",");     
        
        String obj1 = str.substring(8, comma);        
        String obj2 = str.substring(comma + 10);   

        String cap = obj2.substring(0, 1).toUpperCase();
        obj2 = cap + obj2.substring(1);       

        return "Uh! " + obj2 + " " + obj1 + "!";        
    }
}
