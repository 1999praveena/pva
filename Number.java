import java.io.*;
import java.util.*;
class Number
{
public static void main(String args[])
{
int a,i,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter range");

a=sc.nextInt();
for(i=1;i<=a,i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
