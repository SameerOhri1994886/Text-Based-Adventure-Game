package javagameproject;
public abstract class GameObstacles 
{
  int LevelNumber;
  String typeOfObstacle;
  public GameObstacles(int LevelNumber,String typeOfObstacle)
  {
      this.LevelNumber=LevelNumber;
      this.typeOfObstacle=typeOfObstacle;
  }       
  public abstract void obstacles();
} 