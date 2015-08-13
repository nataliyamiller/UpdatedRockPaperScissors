


import org.fluentlenium.adapter.FluentTest;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



import static org.assertj.core.api.Assertions.assertThat;

public class RPSgametest extends FluentTest{

  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();


  @Test
  public void checkWinner_userRockBeatsScissors_String (){
    String test = "Yaaay! User Wins";
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
    String test = "Yaaay! User Wins";
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
    String test = "Yaaay! User Wins";
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

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Play our Awesome");
  }

  @Test
  public void isResultDisplayed() {
    goTo("http://localhost:4567/");
    fill("#userinput").with("Paper");
    submit(".btn");
    assertThat(pageSource()).contains("result is");
  }
}
