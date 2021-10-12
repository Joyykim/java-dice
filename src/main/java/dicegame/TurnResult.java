package dicegame;

public class TurnResult {

    private final String name;
    private final int diceResult1;
    private final int diceResult2;
    private final int currentScore;

    public TurnResult(String name, int diceResult1, int diceResult2, int currentScore) {
        this.name = name;
        this.diceResult1 = diceResult1;
        this.diceResult2 = diceResult2;
        this.currentScore = currentScore;
    }

    public String getName() {
        return name;
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
