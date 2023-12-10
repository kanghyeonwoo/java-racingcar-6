package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.String;


import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class RacingRule {


    final List<String> playerList;
    final int racingCount;
    List<String> playerRacingDistance = new ArrayList<>();
    int[] engine;

    RacingRule (List<String> playerList, String racingCount) {
        this.playerList = playerList;
        this.racingCount = Integer.parseInt(racingCount);
        engine = new int[playerList.size()];
    }

    public void racingPlay() {
        for (int i = 0; i < racingCount; i++){
            roundRaceGo();
            displayPlay();
            playerRacingDistance.clear();
        }

    }
    public void roundRaceGo() {
        for (int i = 0; i < playerList.size(); i++) { // 플레이어 수만큼 반복.
            goStop(i);
            playerRacingDistance.add(showDistance(i));
        }
    }
    public void displayPlay() {
        for(int i = 0;i < playerList.size(); i++) {
            System.out.println(playerList.get(i)+" : "+ playerRacingDistance.get(i));
        }

    }
    public String  showDistance(int i){ // 레이싱 숫자를 -로 변환 함수
        String distance = "";
        for(int j=0; j<engine[i];j++) distance = distance.concat("-");
        return distance;
    }

    public void goStop(int i) {
        if(4 < Randoms.pickNumberInRange(0,9)) engine[i]++;
    }
    public void findWinner(List<String> playerList) {
        System.out.println();
    }
}
