import org.junit.*;
import static org.junit.Assert.*;

public class RPSgametest {

  @Test
  public void checkWinner_userRockBeatsScissors_String (){
    RPSgame RPSgametest = new RPSgame();
    String test = "User Wins";
    assertEquals(test, RPSgametest.checkWinner("Rock", "Scissors"));
  }

  @Test
  public void checkWinner_userRockLosesPaper_String () {
    RPSgame RPSgametest = new RPSgame();
    String test = "Computer Wins";
    assertEquals(test, RPSgametest.checkWinner("Rock", "Paper"));
  }

  @Test
  public void checkWinner_userRockTiesRock_String(){
    RPSgame RPSgametest = new RPSgame();
    String test = "It's a Tie";
    assertEquals(test, RPSgametest.checkWinner("Rock","Rock"));
  }

  @Test
  public void checkWinner_userScissorsBeatsPaper_String () {
    RPSgame RPSgametest = new RPSgame();
    String test = "User Wins";
    assertEquals(test, RPSgametest.checkWinner("Scissors", "Paper"));
  }

  @Test
  public void checkWinner_userScissorsLosesRock_String() {
    RPSgame RPSgametest = new RPSgame();
    String test = "Computer Wins";
    assertEquals(test, RPSgametest.checkWinner("Scissors", "Rock"));
  }

  @Test
  public void checkWinner_userScissorsTiesScissors_String() {
    RPSgame RPSgametest = new RPSgame();
    String test = "It's a Tie";
    assertEquals(test, RPSgametest.checkWinner("Scissors", "Scissors"));
  }

  @Test
  public void checkWinner_userPaperBestsRock_String() {
    RPSgame RPSgametest = new RPSgame();
    String test = "User Wins";
    assertEquals(test, RPSgametest.checkWinner("Paper", "Rock"));
  }

  @Test
  public void checkWinner_userPaperLosesScissors_String () {
    RPSgame RPSgametest = new RPSgame();
    String test = "Computer Wins";
    assertEquals(test, RPSgametest.checkWinner("Paper", "Scissors"));
  }

  @Test
  public void checkWinner_userPaperTiesPaper_String (){
    RPSgame RPSgametest = new RPSgame();
    String test = "It's a Tie";
    assertEquals(test, RPSgametest.checkWinner("Paper", "Paper"));
  }

}
