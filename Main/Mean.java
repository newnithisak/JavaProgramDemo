/**
 * Mean
 */
import java.util.Scanner;
public class Mean {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Sum Numbers : ");
        try {
            int n = in.nextInt();
            double sum = 0 ;
            for (int i = 0; i < n; i++) 
            {
                System.out.print("Enter Number : ");
                sum += in.nextInt();
            }

            System.out.println("******Mean : " + sum/n);
        }

        catch(Exception e){
            System.out.println("*****Input  Number Only!!*****");
        }
    }
}