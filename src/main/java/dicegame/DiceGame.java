package dicegame;

import com.woowahan.techcourse.utils.Randoms;

import java.util.List;
import java.util.stream.Collectors;

public class DiceGame {

    private int turn;
    private Players players;

    public List<TurnResult> playTurn() {
        return players.getPlayerList().stream()
                .map(player -> {
                    int result1 = randomNumber();
                    int result2 = randomNumber();
                    player.plusScore(result1, result2);
                    return new TurnResult(player.getName(), result1, result2, player.getScore());
                })
                .collect(Collectors.toList());
    }

    public void initPlayers(Players players) {
        this.players = players;
    }

    public void initTurn(int turn) {
        this.turn = turn;
    }

    private int randomNumber() {
        return Randoms.pickNumberInRange(1, 6);
    }

    public int getTurn() {
        return turn;
    }

    public Players getPlayers() {
        return players;
    }
}
