package racingcar;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class RacingFlag {
    List<String> splitName;
    public List<String> GetPlayerName(String playerList) {
        splitName = Arrays.asList(playerList.split(","));
        System.out.println(splitName);

        return splitName;
    }
    public boolean PlayerValidTest(List<String> testPlayer) {

        List<String> playerList = testPlayer;
        System.out.println(playerList.size());
        for(int i = 0;i<playerList.size();i++){
        if(playerList.get(i).length()>5){
            System.out.println(playerList.get(i));
            System.out.println("ㄴ");
            return false;
        }
        else{
            System.out.println("통과");
            System.out.println(playerList.get(i));
        }
        }
        return true;
    }
}
