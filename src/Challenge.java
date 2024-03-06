public class Challenge {

    public static void main(String[] args) {

        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("Cristian", score);

        score = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", score);

        score = calculateHighScorePosition(500);
        displayHighScorePosition("Tim", score);

        score = calculateHighScorePosition(100);
        displayHighScorePosition("Patric", score);

        score = calculateHighScorePosition(25);
        displayHighScorePosition("Iulian", score);

        System.out.println("The score number is " + score);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {


        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;

        //OR OR OR another way to do the 'if' block

//        int position = 4;
//        if (playerScore >= 1000) {
//            position = 1;
//        } else if (playerScore >= 500) {
//            position = 2;
//        } else if (playerScore >= 100) {
//            position = 3;
//        }
//
//        return position;

    }

}
