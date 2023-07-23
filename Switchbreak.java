import java.util.Scanner;
public class Switchbreak
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        switch(age)
        {
            case 18:
            System.out.println("you are going to become an adult");
            break;
            case 23:
            System.out.println("you are going to get a job");
            break;
            case 60:
            System.out.println("you are going to get retired");
            break;
            default:
            System.out.println("enjoy your life");

        }
    }
}