package javagameproject;
import java.util.Scanner;
public class JavaGameProject
{
  public static void main(String[] args)
   {
        Player p=new Player();
        p.playerInfo();
        NaturalObstacles nb=new NaturalObstacles(1,"Natural Obstacles");
        nb.obstacles();
        EnemyObstacles ib=new EnemyObstacles(4,"Physical Obstacles");
        p.MakeChoice();
        ib.obstacles();
   }
}
