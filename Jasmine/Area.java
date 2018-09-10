/**
 * Area
 */
import java.util.Scanner;
public class Area {

    public static double rac(double w,double h) {
        return w * h;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Weight = ");
        double w = in.nextDouble();
        System.out.print("Enter Height = ");
        double h = in.nextDouble();
        System.out.println(rac(w,h));
    }  
}