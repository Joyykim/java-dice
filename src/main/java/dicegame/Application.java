package dicegame;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        DiceGame diceGame = new DiceGame();
        diceGame.initPlayers(new Players(ConsoleView.askNames()));
        diceGame.initTurn(ConsoleView.askTurn());

        for (int i = 0; i < diceGame.getTurn(); i++) {
            List<TurnResult> turnResultList = diceGame.playTurn();
            ConsoleView.printTurnResult(turnResultList);
        }
        ConsoleView.printTotalResult(diceGame.getPlayers());
    }
}
