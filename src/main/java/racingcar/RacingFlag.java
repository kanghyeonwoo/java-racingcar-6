package racingcar;

import java.util.Arrays;

public class RacingFlag {
    public static String[] GetPlayerName(String i)
    {
       final String[] splitName = i.split(",");
        System.out.println(Arrays.asList(splitName));
        return splitName;
    }
}
