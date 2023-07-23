import java.util.Scanner;
public class Persentage
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("marks of hindi");
        float hindi=sc.nextFloat();
        System.out.println("marks of english");
        float english=sc.nextFloat();
        System.out.println("marks of maths");
        float maths=sc.nextFloat();
        System.out.println("marks of chemistry");
        float chemistry=sc.nextFloat();
        System.out.println("marks of physics");
        float physics=sc.nextFloat();
        float total=hindi+english+maths+chemistry+physics;
        float persentage=total*100/500;
        System.out.println("the persentage is="+persentage);
    }
}