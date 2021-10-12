package dicegame;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Players {

    private final List<Player> playerList;

    public Players(List<Player> playerList) {
        this.playerList = playerList;
    }

    public Players(String playerNames) {
        this(convertToPlayerList(playerNames));
    }

    private static List<Player> convertToPlayerList(String playerNames) {
        return Arrays.stream(playerNames.split(","))
                .map(Player::new)
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
}
