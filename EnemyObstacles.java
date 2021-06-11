package javagameproject;
import java.util.Scanner;
public class EnemyObstacles extends GameObstacles
{
  public EnemyObstacles(int LevelNumber,String typeOfObstacle)  
   {
       super(LevelNumber,typeOfObstacle);
   }  
    @Override
public void obstacles()
 {
   String obstacle,a;
   Scanner s=new Scanner(System.in);
   int life=100;
   String[]PhysicalObs=new String[3];
   PhysicalObs[0]="The Player has to face the dangerous Carnivorous glue/creature";
   PhysicalObs[1]="The Player has to suffer the stone pelting from the tribal people living in the Forest";
   PhysicalObs[2]="The Player has to fight with the dangerous enemy SnapJaw";
for(int i=0;i<PhysicalObs.length;i++)
  {   
       obstacle=PhysicalObs[i];
       System.out.println();
       if(life==0)
       {
         break;  
       }
       System.out.println("NOW YOU ENTER THE LEVEL :" +LevelNumber);
       System.out.println();
  if(obstacle.equals(PhysicalObs[i]))
   {  
        System.out.println(PhysicalObs[i]);
        System.out.println("Fight or Forfeit");
        a=s.nextLine();
        if(a.equals("Forfeit"))
       {  
        for(int j=0;j<10;j++)
          {
            life --;
            if(life==0)
            {
              System.out.println("GAME OVER : YOU LOST");
              break;
            }     
          }
              System.out.println("Your Life is :"+life);
              i--;
       } 
        if(!(a.equals("Fight")||a.equals("Forfeit")))
        {
          System.out.println("INVALID OPTION...");
          System.out.println("You must have to choose any option");
          System.out.println(PhysicalObs[i]);
          System.out.println("Fight or Forfeit");
          a=s.nextLine();
          if(!(a.equals("Fight")||a.equals("Forfeit")))
         {
          System.out.println("You must have to choose any option");
          break;
         }
        }   
        if(a.equals(""))
       { 
          System.out.println("You must have to choose any option");
          System.out.println(PhysicalObs[i]);
          System.out.println("Fight or Forfeit");
          a=s.nextLine();
          if(a.equals(""))
          {
            System.out.println("You must have to choose any option");
            break;
          }
           if(a.equals("Forfeit"))
           {  
              for(int j=0;j<10;j++)
             {
               life --;
               if(life==0)
               {
                 System.out.println("GAME OVER : YOU LOST");
                 break;
               }     
             }
                 System.out.println("Your Life is :"+life);
                 i--;
           }
               if(a.equals("Fight")&&LevelNumber<6)
          {   
                LevelNumber++;
                System.out.println("You overcome the obstacle and reached the Level " 
                 +LevelNumber);
                System.out.println();
          }
       }
               if(a.equals("Fight")&&LevelNumber<6)
          {   
                LevelNumber++;
                System.out.println("You overcome the obstacle and reached the Level "
                 +LevelNumber);
                System.out.println();
          }
   }
        if(i==2||LevelNumber==7)
      {      
       System.out.println("You HAVE WON AND OVERCOME ALL THE OBSTACLES...");
       System.out.println("THE END");
      } 
  }
 } 
}
