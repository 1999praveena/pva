import java.io.*;
import java.util.*;
class Count
{

public static void main(string args[])
{
Scanner sc=new Scanner(System.in);
int a,count=0;
Syste.out.println("enter num:");
a=sc.nextInt();
while(a>0)
{
count++;
a=a/10;
}
System.out.println(count);
}
}
