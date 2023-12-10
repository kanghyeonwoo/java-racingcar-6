package racingcar;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


    RacingFlag racingFlag = new RacingFlag();
    Scanner scanner = new Scanner(System.in);

    System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    String playerList = scanner.next();

    System.out.println("시도할 회수는 몇회인가요?");
    String racingCount = scanner.next();
    List<String> playerIndex =  racingFlag.GetPlayerName(playerList);
    racingFlag.PlayerValidTest(playerIndex);

    RacingRule racingRule = new RacingRule(playerIndex,racingCount);

    racingRule.racingPlay();

        // TODO: 프로그램 구현
    }
}
