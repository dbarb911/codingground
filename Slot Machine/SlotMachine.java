import java.util.*;

public class SlotMachine
{
 
  static int money = 10;
  String[] results = new String[] {"Cherry","Bar","7","Jewel","Wild"};
  static String[] slotResults = new String[3];
  static String value="";
 
  public static void getResults(String[] results)
  {
  	Random rand = new Random();
    getMoney();
    money-=3;
    
    for(int i =0; i<3; i++)
    {
    value = results[rand.nextInt(results.length)];
    System.out.println(value);
 	slotResults[i] = value;
    }
  	
  }
  
  public static void slotResults()
  {
  
    if(slotResults[0].equals(slotResults[1]) && slotResults[0].equals(slotResults[2]) && !slotResults[0].equals("7"))
    {
       money+=10;	
       System.out.println("You're a winner!!!");
       getMoney();
    }
    else if(slotResults[0].equals(slotResults[1]) && slotResults[0].equals(slotResults[2]))
    {
       money+=50;	
       System.out.println("Jackpot Baby!!!!");
       getMoney();
    }
    else if((slotResults[0].equals(slotResults[1]) || slotResults[0].equals(slotResults[2])) || (slotResults[1].equals(slotResults[2])))
    {
       money+=5;	
       System.out.println("You win a small amount!!");
       getMoney();
    }
    else
    {
       System.out.println("Sorry, roll again!");
       getMoney();
    }
  }

  
  public static void getMoney()
  {
  	
  	System.out.println("You have: " + money + " coins.");
  }
}

