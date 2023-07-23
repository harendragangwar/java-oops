import static java.lang.Math.*;
class staticimport1
{
 void circle(double r)
{
double area = PI*r*r;
System.out.println("math power="+pow(r,2));
System.out.println("The area of circle is:" +area);
}
public static void main(String args[])
{
staticimport obj = new staticimport();
obj.circle(2.3);
}
}


