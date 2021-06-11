package javagameproject;
import java.util.Scanner;
public class NaturalObstacles extends GameObstacles 
{
public NaturalObstacles(int LevelNumber,String typeOfObstacle) 
   {
      super(LevelNumber,typeOfObstacle);
   }
@Override
public void obstacles() 
  {
      String obstacle,a;
      Scanner s=new Scanner(System.in);
      String[]NaturalObs=new String[3];
      NaturalObs[0]="The player has to pass through the dark areas.";
      NaturalObs[1]="The landslides will occur frequently.";
      NaturalObs[2]="Forest Fires will take place.";
      System.out.println("THE GAME STARTS NOW...");
      System.out.println();
for(int j=0;j<NaturalObs.length;j++) 
    {
      obstacle=NaturalObs[j];
      System.out.println("YOU ENTER THE LEVEL :" + LevelNumber);
      System.out.println();
      if(obstacle.equals(NaturalObs[j])) 
       {
          System.out.println(NaturalObs[j]);
          System.out.println("Pass/Rescue");
          a=s.nextLine();
          if(a.equals("Pass")||a.equals("Rescue")) 
        {
          LevelNumber++;
          System.out.println("You overcome the obstacle and reached the Level " + LevelNumber);
          System.out.println();
        }
        if(!(a.equals("Pass")||a.equals("Rescue"))) 
        {
          System.out.println("INVALID OPTION...");
          System.out.println(NaturalObs[j]);
          System.out.println("Pass/Rescue");
          a=s.nextLine();
          if(!(a.equals("Pass")||a.equals("Rescue"))) 
         {
          System.out.println("INVALID OPTION...");
          break;
         } 
          else
         {
           LevelNumber++;
           System.out.println("You overcome the obstacle and reached the Level " + LevelNumber);
           System.out.println();
         }   
        }   
        if(a.equals("")&&j<2) 
         {
            System.out.println("Skip this obstacle...");
            System.out.println();
         }
       }
    }
  }
}
