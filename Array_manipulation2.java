import java.util.Scanner;

public class Arraylab6
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);              
int a[]=new int[10];
System.out.println("Give 10 input");

for(int c=1; c<a.length;c++)
{
  a[c]=sc.nextInt();
  if(a[c]%2!=0){
    System.out.println(a[c]);
  break;
  }
}
}
}

