public class RPSgame {
  public static void main (String[] args){}

    String result;
  public String checkWinner (String userGuess, String computerGuess){

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
    }
    return result;
  }
}
