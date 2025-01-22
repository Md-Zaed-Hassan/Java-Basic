import java.util.Scanner;
  public class problem3{
  public static void main(String args[]){
  String test="*";
  Scanner scan=new Scanner(System.in);
  System.out.println("Give a row");
  int row=scan.nextInt();
  System.out.println("Give coloumn");
  int coloumn=scan.nextInt();
  for(int r=1; r<= row; r++)
  {
     for(int c=1; c<=coloumn; c++)
     {  System.out.print(test);
  }
       System.out.println();
  }
  }
  }