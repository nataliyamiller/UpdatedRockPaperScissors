import org.junit.*;
import static org.junit.Assert.*;

public class RPSgametest {

  @Test
  public void checkWinner_userRockBeatsScissors_String (){
    String test = "User Wins";
    assertEquals(test, RPSgame.checkWinner("Rock", "Scissors"));
  }

  @Test
  public void checkWinner_userRockLosesPaper_String () {
    String test = "Computer Wins";
    assertEquals(test, RPSgame.checkWinner("Rock", "Paper"));
  }

  @Test
  public void checkWinner_userRockTiesRock_String(){
    String test = "It's a Tie";
    assertEquals(test, RPSgame.checkWinner("Rock","Rock"));
  }

  @Test
  public void checkWinner_userScissorsBeatsPaper_String () {
    String test = "User Wins";
    assertEquals(test, RPSgame.checkWinner("Scissors", "Paper"));
  }

  @Test
  public void checkWinner_userScissorsLosesRock_String() {
    String test = "Computer Wins";
    assertEquals(test, RPSgame.checkWinner("Scissors", "Rock"));
  }

  @Test
  public void checkWinner_userScissorsTiesScissors_String() {
    String test = "It's a Tie";
    assertEquals(test, RPSgame.checkWinner("Scissors", "Scissors"));
  }

  @Test
  public void checkWinner_userPaperBestsRock_String() {
    String test = "User Wins";
    assertEquals(test, RPSgame.checkWinner("Paper", "Rock"));
  }

  @Test
  public void checkWinner_userPaperLosesScissors_String () {
    String test = "Computer Wins";
    assertEquals(test, RPSgame.checkWinner("Paper", "Scissors"));
  }

  @Test
  public void checkWinner_userPaperTiesPaper_String () {
    String test = "It's a Tie";
    assertEquals(test, RPSgame.checkWinner("Paper", "Paper"));
  }

}
