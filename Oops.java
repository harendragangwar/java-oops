class Pen
{
    String colour;
    String type;
    public static void write()
    {
        System.out.println("writing solution");
    }
}
public class Oops
{
    public static void main(String arg[])
    {
        Pen x=new Pen();
        x.colour="blue";
        x.type="gel";
        x.write();
    }
}