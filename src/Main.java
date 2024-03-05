public class Main {

    //🏢🏢[KEY-WORDS]🏢🏢
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less then 5000 but greater then 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less then 1000");
        } else {
            System.out.println("Got here!");
        }
    }
}
