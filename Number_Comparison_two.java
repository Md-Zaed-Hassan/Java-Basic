import java.util.Scanner;
public class Task6{
  public static void main(String[] args){
    Scanner myfoot = new Scanner(System.in);
    System.out.println("Give two number:");
    int num1= myfoot.nextInt();
    int num2= myfoot.nextInt();
    if( num1>num2){
      System.out.println("first is greater ");
    }
    else{
     
    System.out.println("first is not greater "); 
    }
  }
}