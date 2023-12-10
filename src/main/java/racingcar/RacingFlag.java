package racingcar;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class RacingFlag {
    List<String> splitName;
    List<String> playerList;

    public List<String> GetPlayerName(String playerList) {
        splitName = Arrays.asList(playerList.split(","));
        System.out.println(splitName);
        return splitName;
    }
    public void PlayerValidTest(List<String> testPlayer) {

        playerList = testPlayer;
//        System.out.println(playerList.size());

        for(int i = 0;i<playerList.size();i++){
            PlayerNameSize(i);
        }
    }
    public void PlayerNameSize(int i) {
        if (playerList.get(i).length() > 5)
            System.out.println(playerList.get(i));
    }
}
