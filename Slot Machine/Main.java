import java.lang.Math;
import java.util.*;
import java.util.Random;

public class Main
{
Scanner scans = new Scanner(System.in);
Game game = new Game();

  public void menu()
 {
    System.out.println("Would you like to roll? \n1.Yes \n2.No");
    String answer = scans.nextLine();
   
    if(answer.toUpperCase().equals("YES") || answer.toUpperCase().equals("1"))
   		{
   		    game.start();
   		} 
   	
   else if(answer.toUpperCase().equals("NO") || answer.toUpperCase().equals("2"))
   		{
   			System.out.println("Please come back later");
     		System.exit(1);
   		}
   		else
   		{
   		    System.out.println("Improper Input...");
   		}
   
    
   
 }
  
  
  
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Slot Machine!");
    
    while(true)
    {
        Main main = new Main();
        main.menu();
    }
    
  }
}
