public class Stringreplace
{
    public static void main(String[]args)
    {
        String letter="Dear <|name|>,Thanks a lot!";
        System.out.println(letter.replace("<|name|>","Harendra"));
    }
}