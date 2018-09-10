/**
 * dontmodEven
 */
import java.util.Scanner;
public class dontmodEven {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter Numbers = ");
        int n = in.nextInt();

        if ((n & 1)==0) {
            System.out.println("*****"+n + " is Even");
        } else {
            System.out.println("*****"+n + " is Odd");   
        }
    }
}