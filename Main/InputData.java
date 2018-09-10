/**
 * InputData
 */
import java.io.*;
public class InputData {
    public static void main(String[] args) {
        String s;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        System.out.print("Enter Your Name Here : ");
        try {
            s = in.readLine();
            System.out.print("Your text is : " + s);
        } catch (Exception e) {
            System.out.println("Read input keyboard error ");
            //TODO: handle exception
        }
    }
    
}