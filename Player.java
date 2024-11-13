public class Player{

  private String name;
  private double trueShootingPs;
  private double pointsPerGame;

  public Player(){
    String name = "null";
    double trueShootingPs = 0.0;
    double pointsPerGame = 0.0;
  }

  public Player(String name, double trueShootingPs, double pointsPerGame){
    this.name = name;
    this.trueShootingPs = trueShootingPs;
    this.pointsPerGame = pointsPerGame;
  }

  public String getName() {
    return name;
  }

  public double getShootingPs() {
    return trueShootingPs;
  }

    public double getPoints() {
    return pointsPerGame;
  }

  public String toString() {
    return "Player: " + name + "\nTrue Shooting PS: " + trueShootingPs + "\nPoints Per Game: " + pointsPerGame;
  }
}