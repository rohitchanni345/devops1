import java.util.Scanner;
class calci
{
    Scanner in = new Scanner(System.in);
    float a1 = in.nextFloat();
    float a2 = in.nextFloat();
    public float sum()
    {
        return(a1+a2);
    }
    public float diff()
    {
       return(a1-a2);
    }
    public float prod()
    {
        return(a1*a2);
    }
    public float div()
    {
        return(a1/a2);
    }
}
class calcu extends calci
{
    public static void main(String args[])
    {
        System.out.println("------Simple calculator------");
        calci n = new calci();
        System.out.println("Sum is:"+n.sum());
        System.out.println("Difference is:"+n.diff());
        System.out.println("Product is:"+n.prod());
        System.out.println("Division is:"+n.div());
    }
}