public class ThirdChallenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighscorePosition("Tim",highScorePosition);
    }
    public static void displayHighscorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " is on position: " + highScorePosition + " on the high score list.");
    }
    public static int calculateHighScorePosition(int highScore){

        int finalScore = highScore;

        if(finalScore >= 1000){
            return 1;
        } else if (finalScore >= 500 && finalScore < 1000 ) {
            return 2;

        } else if (finalScore >= 100 && finalScore < 500) {
            return 3;
        }
        else{
            return 4;
        }


    }
}
