import org.junit.*;
import static org.junit.Assert.*;

public class RPSgametest {

  @Test
  public void checkWInner_rockBeatsScissors_true {
    RPSgame RPSgametest = new RPSgame()
    assertEquals(true, RPSgametest.checkWinner("Rock", "Scissors"));
  }
}
