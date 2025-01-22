import java.util.Scanner;
public class task3
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
 int num[]=new int[5];
 for(int c=0;c<num.length; c++)
{
  System.out.println("Enter a value :");
  num[c]=sc.nextInt();
}
  int max=num[0];
  int min=num[0];
  int loc$max=0;
  int loc$min=0;
for(int i=0; i<num.length; i++)
{
if(num[i]> max)
{max=num[i];
loc$max=i;
}
else if(num[i]<min)
{
min=num[i];
loc$min=i;
}
}
System.out.println("Smallest number "+min+" was found at location "+loc$min+
                  " Largest number "+max+" was found at location "+loc$max);
}
}