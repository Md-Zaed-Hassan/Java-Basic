import java.util.Scanner;
public class Task8{
  public static void main(String[] args){
    Scanner myfoot = new Scanner(System.in);
    System.out.println("Give two number:");
    int num1= myfoot.nextInt();
    int num2= myfoot.nextInt();
    if( num1>num2){
      int sub= num1-num2;
      System.out.println("The substraction is  " +sub);
    }
    else{
     int sub= num2-num1;
    System.out.println("The substraction is "  +sub); 
    }
  }
}