public class MainChallenge {


    public static void main(String[] args) {
        System.out.println("Your final score was " + calculateScore(true, 800, 5, 100));
        System.out.println("Your final score was " + calculateScore(true, 10_000, 8, 200));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1_000;
        }

        return finalScore;
    }
}