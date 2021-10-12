package dicegame;

public class ThrowResult {

    private final int diceResult1;
    private final int diceResult2;
    private final int currentScore;

    public ThrowResult(int diceResult1, int diceResult2, int currentScore) {
        this.diceResult1 = diceResult1;
        this.diceResult2 = diceResult2;
        this.currentScore = currentScore;
    }

    public int getDiceResult1() {
        return diceResult1;
    }

    public int getDiceResult2() {
        return diceResult2;
    }

    public int getCurrentScore() {
        return currentScore;
    }
}
