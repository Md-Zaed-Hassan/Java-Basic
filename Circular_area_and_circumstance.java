import java.util.Scanner;
public class Task5{
  public static void main(String[] args){
    Scanner myfoot = new Scanner(System.in);
    System.out.println("Give a radius:");
    float pie= 3.1416f;
    int r= myfoot.nextInt();
    float Area= pie*r*r; 
    float c= 2*pie*r;
   
    
    
 
    System.out.println("The area is  " +Area  +  "  The circumstance is  "   +c);
  }
}