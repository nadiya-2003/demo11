import java.util.Scanner;
class ReplaceAll
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n =sc.nextLine();
char c=sc.next().charAt(0);
String r=String.valueOf(c);
String res=n.replaceAll(r,"#");
System.out.println(res);
}
}