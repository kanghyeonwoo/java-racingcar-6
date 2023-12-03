package racingcar;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class RacingRule {

int checkRace=0;

static List<String> playerRaceCount;

//    public List<String> Racing(String PlayCount, String playerCount){
//    return 0;
//    }
//    public List<String> racingPlay(String PlayCount){
//        return 0;
//    }
    public int randomRace(String playerCount){
        checkRace=0;
        for(int j=0; j < Integer.parseInt(playerCount);j++){
            raceCheck(checkRace);
        }
        System.out.println(checkRace);
        return checkRace;
    }
    public int raceCheck(int i){

        if(Randoms.pickNumberInRange(0,9) > 4){
            System.out.println("달리기 성공!");
            i++;
        }
        else{
            System.out.println("달리기실패ㅠ");
        }
        checkRace = i;
        return 0;
    }

}
