import java.util.Scanner;
public class Task7{
  public static void main(String[] args){
    Scanner myfoot = new Scanner(System.in);
    System.out.println("Give row:");
    int row= myfoot.nextInt();
    for(int c=1;c<=row;c++)
    {
    for(int i=1; i<=row-c; i++)
    {
    System.out.print(" ");
    }
    for(int j=1; j<=c; j++)
    {
      System.out.print("*");
    }
    System.out.println();
  }
     
}
}
    