public class Stringmethod
{
    public static void main(String[]args)
    {
        String name="harendra";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,6));
        System.out.println(name.replace('h','n'));
        System.out.println(name.startsWith("ha"));
        System.out.println(name.endsWith("ra"));
        System.out.println(name.charAt(7));
        System.out.println(name.indexOf('e'));
        System.out.println(name.lastIndexOf('e'));
        System.out.println(name.equals("harendra"));
        System.out.println(name.equalsIgnoreCase("harendra"));







    }
}