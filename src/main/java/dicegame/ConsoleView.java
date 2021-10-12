package dicegame;

import com.woowahan.techcourse.utils.Console;

import java.util.List;

public class ConsoleView {

    public static String askNames() {
        System.out.println("플레이어들의 이름을 쉼표(,)로 구분하여 입력해주세요");
        return Console.readLine();
    }

    public static int askTurn() {
        System.out.println("턴을 입력해주세요");
        return Integer.parseInt(Console.readLine());
    }

    public static void printTurnResult(List<TurnResult> turnResults) {
        for (TurnResult turnResult : turnResults) {
            System.out.printf("%s의 차례입니다.\n", turnResult.getName());

            for (ThrowResult throwResult : turnResult.getThrowResults()) {
                System.out.printf("주사위 결과 : %d, %d\n", throwResult.getDiceResult1(), throwResult.getDiceResult2());
                System.out.printf("현재까지 얻은 점수 : %d\n", throwResult.getCurrentScore());
                System.out.println();
            }
            System.out.println("---\n");
        }
    }

    public static void printTotalResult(Players players) {
        System.out.println("총 점수");
        for (Player player : players.getPlayerList()) {
            System.out.printf("%s : %d 점%n", player.getName(), player.getScore());
        }
    }
}
