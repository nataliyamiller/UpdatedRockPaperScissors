import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RPSgame {
  public static void main (String[] args){

    String result;
    Random myRandomGenerator = new Random();
    Integer randomNumber = myRandomGenerator.nextInt(2);
    String computerGuess = makeComputerGuess(randomNumber);
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get ("/detector", (request,response) -> {
      Map<String, Object> model = new HashMap<String,Object>();
      model.put("template", "templates/detector.vtl");

      String userInput = request.queryParams("user input");


      String checkWinner = checkWinner(userInput, computerGuess);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }


  public static String makeComputerGuess(Integer randomNumber){
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

    if (userGuess == "Rock"){

      if (computerGuess == "Scissors"){
        result = "User Wins";
      } else if (computerGuess == "Paper") {
        result = "Computer Wins";
      } else {
      result = "It's a Tie";
      }


    } else if (userGuess == "Scissors") {
      if (computerGuess == "Paper"){
      result = "User Wins";
    } else if (computerGuess == "Rock"){
      result = "Computer Wins";
    } else {
      result = "It's a Tie";
    }


    } else {
      if (computerGuess == "Rock"){
        result = "User Wins";
      } else if (computerGuess == "Scissors") {
        result = "Computer Wins";
      } else {
        result = "It's a Tie";
      }

  }
    return result;
  }
}
