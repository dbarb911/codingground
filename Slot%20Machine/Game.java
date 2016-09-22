import java.util.*;

public class Game
{
SlotMachine main = new SlotMachine();
  
  public void start()
  {
    
    main.getResults(main.results);
  	main.slotResults();
    if(main.money<=2)
      {
          System.out.println("Your're broke! Thanks for playing!");
          System.exit(1);
      }
  }
  
}