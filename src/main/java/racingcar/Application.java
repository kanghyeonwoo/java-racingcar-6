package racingcar;

import java.util.List;
import java.util.Scanner;
import java.util.Random;
import racingcar.RacingFlag;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerList = scanner.next();
        //System.out.println(playerList);
        RacingFlag referee = new RacingFlag();

        referee.GetPlayerName(playerList);


        // TODO: 프로그램 구현
    }
}
