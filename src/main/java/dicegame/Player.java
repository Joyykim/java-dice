package dicegame;

public class Player {

    private final String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public void plusScore(int result1, int result2) {
        this.score += result1 + result2;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
