//Splitting a string

class strsplit
{
public static void main(String args[])
{
String str = "Hello, this is a book on java";
String s[];
s = str.split(" ");
System.out.println("String length="+str.length());
for(int i=0; i<s.length; i++)
System.out.println(s[i]);
}
}



