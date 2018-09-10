/**
 * Palindrome
 */
import java.util.*;
    public class Palindrome {

        public static void main(String[] args) {
            String original ,reverse =""; 
            Scanner in = new Scanner (System.in);
            System.out.print("Enter String/Number = ");
            original = in.nextLine();

            int length = original.length();
            for (int i = length-1; i >=0; i--) 
                reverse = reverse + original.charAt(i);

                if (original.equals(reverse)) 
                    System.out.println(reverse + " is Palindrome!!");
                 else 
                    System.out.println(reverse + " is Not Palindrome!!");  
                
            
        }
    
}
