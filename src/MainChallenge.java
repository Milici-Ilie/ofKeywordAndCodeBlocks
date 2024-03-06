public class MainChallenge {

    //🏢🏢[KEY-WORDS]🏢🏢
    public static void main(String[] args) {


        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The highScore is " + highScore);
        //🌠🌠[METHODS]🌠🌠 here we are calling the method/ this is similar with calling functions in JS
        // === so the logic here is that the code will start from the top and when will reach the
        // "method"'calculateScore()' will call the method from bellow than will continue with the normal code🌠🌠[METHODS]🌠🌠


        System.out.println("The next highScore is " +
                calculateScore(true, 10000, 8, 200));//🌠🌠[METHODS]🌠🌠 this is our second call for the 'method' and we pass all the arguments (4 in total)🌠🌠[METHODS]🌠🌠
    }

    //🌠🌠[METHODS]🌠🌠
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        //🌠🌠[METHODS]🌠🌠 here we are creating a method that has the possibility to return some values by including the 'int' statement, also we need to 'return' something 👇👇
        //🌠🌠[METHODS]🌠🌠 here we are canceling the variables because we call them in the (...parameters...) inside of our method

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }


    //just an EXEMPLE of how to calculate age 👇
    public static boolean isTooYoung(int age) {
        boolean result = false;
        if (age < 21) {
            result = true;
        }

        return result;
    }

}

