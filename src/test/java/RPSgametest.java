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

}
