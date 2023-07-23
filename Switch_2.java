import java.util.Scanner;
public class Switch_2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a day");
        char day=sc.next().charAt(0);
        switch(day)
        {
            case 'm':
            System.out.println("this is monday");
            break;
            case 't':
            System.out.println("this is teusday");
            break;
            case 'w':
            System.out.println("this is wednsday");
            break;
            case 'h':
            System.out.println("this is thursday");
            break;
            case 'f':
            System.out.println("this is friday");
            break;
            case 's':
            System.out.println("this is saturday");
            break;
            default:
            System.out.println("this is sunday");
            



            
        }
    }
}