package racingcar;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerList = scanner.next();
        String racingCount = scanner.next();
        RacingFlag referee = new RacingFlag();
        RacingRule rule = new RacingRule();

        List<String> playerIndex =  referee.GetPlayerName(playerList);
        int playerLength = playerIndex.size();

        referee.PlayerValidTest(playerIndex);
        rule.randomRace(String.valueOf(racingCount));

        // TODO: 프로그램 구현
    }
}
