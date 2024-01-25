import java.util.Scanner;
public class biggest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number:");
        double num1 = sc.nextDouble();
        System.out.println("Second number:");
        double num2 = sc.nextDouble();
        System.out.println("Third number:");
        double num3 = sc.nextDouble();
        if(num1>num2 && num1>num3)
        {
            System.out.println("num1 is greatest");
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("num2 is greatest");
        }
        else
        {
            System.out.println("num3 is greatest");
        }
    }    
}