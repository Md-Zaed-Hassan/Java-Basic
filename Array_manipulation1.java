import java.util.Scanner;

public class Arraylab3
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);              
int a[]=new int[10];
System.out.println("Give 10 input");

for(int c=1; c<a.length;c++)
{
  a[c]=sc.nextInt();
}
for(int n=a.length-1;n>=0;n--)
{
System.out.println(a[n]);
}
}
}

