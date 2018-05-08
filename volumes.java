import java.lang.*;
class Volume
{
int length,height;
double pi=3.14;
double volumes(int l,int h)
{
System.out.println("volume");
return 0;
}
}
class volumeb extends Volume
{
double volumes(int l,int h)
{
double A;
A=((pi*l*h)*(h/3));
System.out.println("volume="+A);
return A;
}
}
class volumec extends Volume
{
double volumes(int l,int h)
{
double V=((l*l)*h);
System.out.println("volume="+V);
return V;
}
}
public class volumes
{
public static void main(String st[])
{
volumeb B=new volumeb();
B.volumes(50,10);
volumec C=new volumec();
C.volumes(50,10);
}
}