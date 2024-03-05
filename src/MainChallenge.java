public class MainChallenge {

    //🏢🏢[KEY-WORDS]🏢🏢
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        calculateScore(true, 800, levelCompleted, bonus);//🌠🌠[METHODS]🌠🌠 here we are calling the method/ this is similar with calling functions in JS
        // === so the logic here is that the code will start from the top and when will reach the
        // "method"'calculateScore()' will call the method from bellow than will continue with the normal code


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);// this method is equal to === finalScore =
            // finalScore + (leverCompleted * bonus);
        }
    }

    //🌠🌠[METHODS]🌠🌠
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        //🌠🌠[METHODS]🌠🌠 here we are canceling the variables because we call them in the (...parameters...) inside of our method

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);// this method is equal to === finalScore =
            // finalScore + (leverCompleted * bonus);
        }
    }
}
