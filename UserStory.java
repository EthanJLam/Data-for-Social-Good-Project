import java.util.Scanner;

public class UserStory {

  private Player[] person;

  public UserStory(String playersFile, String trueShootingPsFile, String pointsPerGameFile){
    person = createPlayer(playersFile, trueShootingPsFile, pointsPerGameFile);
  }

  public Player[] createPlayer(String playersFile, String trueShootingPsFile, String pointsPerGameFile) {
    String [] players = FileReader.toStringArray(playersFile);
    double [] trueShootingPs = FileReader.toDoubleArray(trueShootingPsFile);
    double [] pointsPerGame = FileReader.toDoubleArray(pointsPerGameFile);
    Player [] nbaPlayer = new Player [players.length];

    for (int i = 0; i < nbaPlayer.length; i++){
      nbaPlayer[i] = new Player(players[i], trueShootingPs[i], pointsPerGame[i]);
    
    }
    return nbaPlayer;
  }


  public String calcBestOverallScorer(){
    double totalPoints = person[0].getShootingPs() + person[0].getPoints();
    int highestIndex = 0;
    
    for(int i = 0; i < person.length; i++){
      double currentOverall = person[i].getShootingPs() + person[i].getPoints();
      if (currentOverall > totalPoints) {
        totalPoints = currentOverall;
        highestIndex = i;
      }
      
    }
      return person[highestIndex].getName(); 
  }
public String toString() {
  return "Greatest Overall Scorer is: " + calcBestOverallScorer(); 
} 
}