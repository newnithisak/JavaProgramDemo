import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        System.out.print("Enter string to reverse: ");
        
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reversed string is:" + reverse);
        /*if (str.equals(reverse)) {
            System.out.println("Pali");
        } else {
            System.out.println("not Pali");
            
        } */
    }
}