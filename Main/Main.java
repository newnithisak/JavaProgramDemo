/**
 * Main
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Height(m): ");
        double h = in.nextDouble();
        System.out.print("Enter Weight(kg): ");
        double w = in.nextDouble();
        System.out.println("*****BMI = " + BodyMass.bmi(h, w)+ "*****");
    }
}