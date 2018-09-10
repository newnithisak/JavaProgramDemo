/**
 * Num
 */
import java.util.Scanner;
public class Num {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int n = in.nextInt(); 
        if ((n%2)==0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        
        }
        
    }
}