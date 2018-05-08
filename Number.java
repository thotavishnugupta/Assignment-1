import java.lang.*;
import java.util.Scanner;

interface InfaceX
{
 void Reverse();
}
class Reverse implements InfaceX
{
public void Reverse()
 {
	double num=0;
	double reversenum=0,rev;
	System.out.println("enter number");
	Scanner in=new Scanner(System.in);
	num=in.nextInt();
	while(num!=0)
	{
		rev=num%10;
		reversenum=reversenum*10+rev;
		num=num/10;
	}
	System.out.println("number after reversing="+reversenum);
 }
}

public class Number
{
public static void main(String str[])
{
Reverse S=new Reverse();
InfaceX x;
x=S;
S.Reverse();
}
}

