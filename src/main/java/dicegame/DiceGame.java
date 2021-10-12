package dicegame;

import com.woowahan.techcourse.utils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DiceGame {

    private int turn;
    private Players players;

    public List<TurnResult> playTurn() {
        return players.getPlayerList().stream()
                .map(this::play)
                .collect(Collectors.toList());
    }

    private TurnResult play(Player player) {
        TurnResult turnResult = new TurnResult(player.getName(), new ArrayList<>());

        while (true) {
            int result1 = randomNumber();
            int result2 = randomNumber();
            player.plusScore(result1, result2);
            turnResult.add(new ThrowResult(result1, result2, player.getScore()));

            if (result1 == result2) {
                break;
            }
        }
        return turnResult;
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
