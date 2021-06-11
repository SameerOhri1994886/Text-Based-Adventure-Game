package javagameproject;
import java.util.Scanner;
public class Player implements Action, Choice 
{
  public void playerInfo() 
 {
    String PlayerName,PlayerJob,FavouriteMeal;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the name of Player : ");
    PlayerName=s.nextLine();
    if(PlayerName.equals("")) 
    {
      PlayerName="GUEST";
      System.out.println("You have logged in as : GUEST");
      System.out.println();
    }
      System.out.println("Choose your job : ");
      System.out.println("Corporal/Sergeant/Command Sergeant Major");
      PlayerJob=s.nextLine();
    if(PlayerJob.equals("")||!(PlayerJob.equals("Corporal") 
       ||PlayerJob.equals("Sergeant") 
       ||PlayerJob.equals("Command Sergeant Major"))) 
    {
      System.out.println("NOT A VALID CHOICE...");
      System.out.println("Please select any option :");
      System.out.println("Choose your job : ");
      System.out.println("Corporal/Sergeant/Command Sergeant Major");
      PlayerJob=s.nextLine();
      if(PlayerJob.equals("")||!(PlayerJob.equals("Corporal") 
         ||PlayerJob.equals("Sergeant") 
         ||PlayerJob.equals("Command Sergeant Major")))
     {
      System.out.println("By default,your job is selected as : Corporal");
      System.out.println();
      PlayerJob="Corporal";
     }
    }
      System.out.println("Choose your favourite meal : ");
      System.out.println("Bread/Pizza/Sandwich/Omelett/Fish/Pasta/Yogurt");
      FavouriteMeal=s.nextLine();
      if(FavouriteMeal.equals("")||!(FavouriteMeal.equals("Bread") 
       ||FavouriteMeal.equals("Pizza")||FavouriteMeal.equals("Sandwich") 
       ||FavouriteMeal.equals("Omelette")||FavouriteMeal.equals("Pasta") 
       ||FavouriteMeal.equals("Yogurt")))
   {
      System.out.println("NOT A VALID CHOICE...");
      System.out.println("Please select any option :");
      System.out.println("Choose your favourite meal : ");
      System.out.println("Bread/Pizza/Sandwich/Omelette/Fish/Pasta/Yogurt");
      FavouriteMeal=s.nextLine();
      if(FavouriteMeal.equals("")||!(FavouriteMeal.equals("Bread") 
         ||FavouriteMeal.equals("Pizza")||FavouriteMeal.equals("Sandwich") 
         ||FavouriteMeal.equals("Omelette")||FavouriteMeal.equals("Pasta")
         ||FavouriteMeal.equals("Yogurt")))
     {
        System.out.println("By default,your favourite meal is selected as : Fish");
        FavouriteMeal="Fish";
     }
   }
        System.out.println();
 }
    @Override
    public void run() 
  {
    System.out.println("The player has to run in the direction according to the map so as to reach the right destination and the next level.");
  }
    @Override
    public void jump() 
  {
    System.out.println("The player has to jump through various rocky,rough,difficult,hard and arduous paths.");
  }
    @Override
    public void dive() 
  {
    System.out.println("The player has to dive in order to protect himself/herself from the attacks of the enemies.");
  }
    @Override
    public void climb() 
   {
     System.out.println("The player can climb the trees and can also climb to the ropes");
   }
    @Override
    public void pickingThings() 
   {
    System.out.println("The player can get various things to pick,i.e,egg,sword,riffle,armour,bottle,etc.");
   }
    @Override
    public void MakeChoice() 
 {
    Scanner s =new Scanner(System.in);
    String s1;
    int k;
    int choice=0;
    System.out.println("Now,Following are the choices that you can make:");
    System.out.println("");
    String[]choices=new String[30];
    choices[0]="Pick up the sword.";
    choices[1]="Climb the tree.";
    choices[2]="Take the bottle.";
    choices[3]="Go to north.";
    choices[4]="Pick the armour.";
    choices[5]="Take the egg.";
    choices[6]="Go to east.";
    choices[7]="Pick up the gun.";
    choices[8]="Pick up the box.";
    choices[9]="Run.";
    choices[10]="Jump.";
    choices[11]="Dive.";
    choices[12]="Go to south.";
    choices[13]="Get the Energy Booster.";
    choices[14]="Take Lantern.";
    choices[15]="Take rope.";
    choices[16]="Take Knife.";
    choices[17]="Open trap door.";
    choices[18]="Reload the gun.";
    choices[19]="Hit the punch.";
    choices[20]="Leg Kick.";
    choices[21]="Go to west.";
    choices[22]="Take coins.";
    choices[23]="Go to southeast.";
    choices[24]="Enter the treasure room.";
    choices[25]="Take many other weapons.";
    choices[26]="Take a leather bag.";
    choices[27]="Go to northwest.";
    choices[28]="Build a shelter.";
    choices[29]="Heal your wounds.";
for(int i=0;i<choices.length;i++) 
   {
      if(i==2) 
     {
        System.out.println("Make a choice:");
        s1=s.nextLine();
        System.out.println("");
        if(s1.equals(choices[0])||s1.equals(choices[1])) 
        {
          System.out.println(choices[i]);
          choice++;
        } 
        else 
        {
          System.out.println("Choice not found...");
          System.out.println("Again,Make a choice:");
          s1=s.nextLine();
          System.out.println("");
          if(s1.equals(choices[0])||s1.equals(choices[1])) 
          {
            System.out.println(choices[i]);
            choice++;
          } 
          else 
          {
            System.out.println("You must make a choice...otherwise you may lost");
            break;
          }
        }
     } 
      else 
       {
      if(i==5)
         {
            System.out.println("Make a choice:");
            s1=s.nextLine();
            System.out.println("");
            if(s1.equals(choices[2])||s1.equals(choices[3])
                  ||s1.equals(choices[4])) 
          {
            System.out.println(choices[i]);
            choice++;
          } 
          else 
          {
            System.out.println("Choice not found...");
            System.out.println("Again,Make a choice:");
            s1=s.nextLine();
            System.out.println("");
            if(s1.equals(choices[2])||s1.equals(choices[3])
                    ||s1.equals(choices[4])) 
            {
              System.out.println(choices[i]);
              choice++;
            } 
            else 
            {
              System.out.println("You must make a choice...otherwise you may lost");
              break;
            }
         }
        } 
      else 
      {
          if(i==8) 
          {
            System.out.println("Make a choice:");
            s1=s.nextLine();
            System.out.println("");
          if(s1.equals(choices[5])||s1.equals(choices[6])
                  ||s1.equals(choices[7])) 
           {
              System.out.println(choices[i]);
              choice++;
           } 
          else 
          {
              System.out.println("Choice not found...");
              System.out.println("Again,Make a choice:");
              s1=s.nextLine();
              System.out.println("");
            if(s1.equals(choices[5])||s1.equals(choices[6])
                 ||s1.equals(choices[7])) 
            {
                System.out.println(choices[i]);
                choice++;
            } 
            else 
            {
                System.out.println("You must make a choice...otherwise you may lost");
                break;
            }
          }
      } 
    else 
      {
            if(i==10) 
           {
              System.out.println("Make a choice:");
              s1=s.nextLine();
              System.out.println("");
              if (s1.equals(choices[8]) || s1.equals(choices[9])) 
              {
                System.out.println(choices[i]);
                choice++;
              } 
              else 
              {
                System.out.println("Choice not found...");
                System.out.println("Again,Make a choice:");
                s1=s.nextLine();
                System.out.println("");
                if(s1.equals(choices[8])||s1.equals(choices[9])) 
                {
                  System.out.println(choices[i]);
                  choice++;
                } 
                else 
                {
                  System.out.println("You must make a choice...otherwise you may lost");
                  break;
                }
           }
      } 
    else 
      {
              if(i==13) 
            {
                System.out.println("Make a choice:");
                s1=s.nextLine();
                System.out.println("");
               if(s1.equals(choices[10])||s1.equals(choices[11])
                       ||s1.equals(choices[12])) 
              {
                  System.out.println(choices[i]);
                  choice++;
              } 
               else
              {
                  System.out.println("Choice not found...");
                  System.out.println("Again,Make a choice:");
                  s1=s.nextLine();
                  System.out.println("");
                  if(s1.equals(choices[10])||s1.equals(choices[11])||s1.equals(choices[12])) 
                 {
                    System.out.println(choices[i]);
                    choice++;
                 } 
                  else 
                 {
                    System.out.println("You must make a choice...otherwise you may lost");
                    break;
                 }
            }
      } 
    else 
     {
              if(i==15) 
             {
                System.out.println("Make a choice:");
                s1=s.nextLine();
                System.out.println("");
                if(s1.equals(choices[13])||s1.equals(choices[14])) 
               {
                  System.out.println(choices[i]);
                  choice++;
               } 
                else 
               {
                  System.out.println("Choice not found...");
                  System.out.println("Again,Make a choice:");
                  s1=s.nextLine();
                  System.out.println("");
                  if(s1.equals(choices[13])||s1.equals(choices[14]))
                 {
                      System.out.println(choices[i]);
                      choice++;
                 } 
                  else 
                 {
                      System.out.println("You must make a choice...otherwise you may lost");
                      break;
                 }
             }
     }       
    else 
     {
                if(i==18)
               {
                  System.out.println("Make a choice:");
                  s1=s.nextLine();
                  System.out.println("");
                  if(s1.equals(choices[15])||s1.equals(choices[16])
                          ||s1.equals(choices[17])) 
                 {
                      System.out.println(choices[i]);
                      choice++;
                 } 
                  else 
                 {
                      System.out.println("Choice not found...");
                      System.out.println("Again,Make a choice:");
                      s1=s.nextLine();
                      System.out.println("");
                      if(s1.equals(choices[15])||s1.equals(choices[16])
                           ||s1.equals(choices[17])) 
                     {
                      System.out.println(choices[i]);
                      choice++;
                     } 
                      else 
                     {
                      System.out.println("You must make a choice...otherwise you may lost");
                      break;
                     }
               }
     } 
    else 
     {
          if(i==20) 
         {
              System.out.println("Make a choice:");
              s1=s.nextLine();
              System.out.println("");
              if(s1.equals(choices[18])||s1.equals(choices[19]))
             {
              System.out.println(choices[i]);
              choice++;
             } 
              else 
             {
              System.out.println("Choice not found...");
              System.out.println("Again,Make a choice:");
              s1=s.nextLine();
              System.out.println("");
              if(s1.equals(choices[18])||s1.equals(choices[19])) 
             {
              System.out.println(choices[i]);
              choice++;
             } 
              else 
             {
              System.out.println("You must make a choice...otherwise you may lost");
              break;
             }
         }
     }                  
    else 
     {
           if(i==23) 
          {
            System.out.println("Make a choice:");
            s1=s.nextLine();
            System.out.println("");
            if(s1.equals(choices[20])||s1.equals(choices[21])
                    ||s1.equals(choices[22])) 
           {
            System.out.println(choices[i]);
            choice++;
           } 
            else 
           {
            System.out.println("Choice not found...");
            System.out.println("Again,Make a choice:");
            s1=s.nextLine();
            System.out.println("");
            if(s1.equals(choices[20])||s1.equals(choices[21])
                    ||s1.equals(choices[22])) 
           {
            System.out.println(choices[i]);
            choice++;
           } 
            else 
           {
            System.out.println("You must make a choice...otherwise you may lost");
            break;
           }
          }
     } 
    else 
     {
            if(i==25)
          {
            System.out.println("Make a choice:");
            s1=s.nextLine();
            System.out.println("");
            if(s1.equals(choices[23])||s1.equals(choices[24])) 
           {
            System.out.println(choices[i]);
            choice++;
           } 
            else 
          {
            System.out.println("Choice not found...");
            System.out.println("Again,Make a choice:");
            s1=s.nextLine();
            System.out.println("");
            if(s1.equals(choices[23])||s1.equals(choices[24])) 
           {
            System.out.println(choices[i]);
            choice++;
           } 
            else 
           {
            System.out.println("You must make a choice...otherwise you may lost");
            break;
           }
          }
     } 
    else 
     {
              if(i==27) 
            {
              System.out.println("Make a choice:");
              s1=s.nextLine();
              System.out.println("");
              if(s1.equals(choices[25])||s1.equals(choices[26])) 
             {
              System.out.println(choices[i]);
              choice++;
             } 
              else 
            {
              System.out.println("Choice not found...");
              System.out.println("Again,Make a choice:");
              s1=s.nextLine();
              System.out.println("");
              if(s1.equals(choices[25])||s1.equals(choices[26])) 
             {
              System.out.println(choices[i]);
              choice++;
             } 
              else 
             {
              System.out.println("You must make a choice...otherwise you may lost");
              break;
             }
            }
     } 
    else 
     {
              if(i==29) 
            {
              System.out.println(choices[i]);
              System.out.println("Make a choice:");
              s1=s.nextLine();
              System.out.println("");
                if(s1.equals(choices[27])||s1.equals(choices[28])
                       ||s1.equals(choices[29])) 
              {
                choice++;
                System.out.println("Number of choices made by Player :" + choice);
              } 
                else 
              {
                System.out.println("Choice not found...");
                System.out.println("Again,Make a choice:");
                s1= s.nextLine();
                System.out.println("");
                  if(s1.equals(choices[27])||s1.equals(choices[28])
                         ||s1.equals(choices[29])) 
                {
                  choice++;
                  System.out.println("Number of choices made by Player :" + choice);
                } 
                  else 
                {
                  System.out.println("You must make a choice...otherwise you may lost");
                  break;
                }
            }
     } 
                   else 
                 {
                   System.out.println(choices[i]);
                 }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
