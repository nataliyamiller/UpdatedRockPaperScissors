import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RPSgame {
  public static void main (String[] args) {

    String layout = "templates/layout.vtl";


    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get ("/detector", (request,response) -> {
      Map<String, Object> model = new HashMap<String,Object>();
      model.put("template", "templates/detector.vtl");

      String userGuess = request.queryParams("userinput");

      Random myRandomGenerator = new Random();
      Integer randomNumber = myRandomGenerator.nextInt(3);
      String computerGuess = makeComputerGuess(randomNumber);
      String result = checkWinner(userGuess, computerGuess);

      model.put("result", result);



      String checkWinner = checkWinner(userGuess, computerGuess);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }


  public static String makeComputerGuess(Integer randomNumber) {
    String computerGuess;

    if (randomNumber == 0){
      computerGuess = "Rock";
    } else if (randomNumber == 1) {
      computerGuess = "Paper";
    } else {
      computerGuess = "Scissors";
    }
    return computerGuess;


  }

  public static String checkWinner (String userGuess, String computerGuess){
    String result;
    String sentence = "Yaaay!";
    if (userGuess == "Rock"){

      if (computerGuess == "Scissors"){
        result = String.format("%s User Wins", sentence);
      } else if (computerGuess == "Paper") {
        result = "Computer Wins";
      } else {
      result = "It's a Tie";
      }


    } else if (userGuess == "Scissors") {
      if (computerGuess == "Paper"){
      result = String.format("%s User Wins", sentence);
    } else if (computerGuess == "Rock"){
      result = "Computer Wins";
    } else {
      result = "It's a Tie";
    }


    } else {
      if (computerGuess == "Rock"){
        result = String.format("%s User Wins", sentence);
      } else if (computerGuess == "Scissors") {
        result = "Computer Wins";
      } else {
        result = "It's a Tie";
      }

  }
    return result;
  }
}

// RPSgame.checkWinner()

//  RPSgame myGame = new RPSgame();
// myGame.checkWinner()
