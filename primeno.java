import java.util.Scanner;
public class primeno
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter lower bound of the interval: ");
        int a = s.nextInt();
        System.out.printf("Enter upper bound of the interval: ");
        int b = s.nextInt(); 
        System.out.printf("Prime numbers are: ", a, b);
        for (int i = a; i <= b; i++)
        {
            if (i == 1 || i == 0)
            {
                continue;
            }
            int flag = 1;
            for (int j = 2; j <= i / 2; ++j)
            {
                if (i % j == 0)
                {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
            {
                System.out.println(i);

            }
        } 
    }
}
