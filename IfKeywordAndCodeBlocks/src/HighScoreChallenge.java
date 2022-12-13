public class HighScoreChallenge {
    public static void main(String[] args) {
        int newScore = calculateHighScores(1500);
        displayName("Tim", newScore);

        newScore = calculateHighScores(500);
        displayName("Willy", newScore);

        newScore = calculateHighScores(0);
        displayName("Daniel", newScore);

    }
    public static void displayName(String playerName, int highScore){
        System.out.println(playerName + " has done well and is in place: " + highScore);
    }

    public static int calculateHighScores(int highScore){
        int finalScore = highScore;

        if(finalScore >= 2000){
            return 1;
        } else if (finalScore >= 1000 && finalScore < 2000) {
            return 2;
        } else if (finalScore >= 500 && finalScore < 1000) {
            return 3;
        }
        else{
            return 4;
        }

    }
}
