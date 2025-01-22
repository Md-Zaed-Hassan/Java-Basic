import java.util.Scanner;
public class Task9{
  public static void main(String[] args){
    Scanner myfoot = new Scanner(System.in);
    System.out.println("Give  A number:");
    int num1= myfoot.nextInt();
   
     if( num1%2==0){
      System.out.println("The number is even ");
    }
    else{
     
    System.out.println("The number is odd "); 
    }
  }
}