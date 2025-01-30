package xyz.danko.adventofcode.day1;

import java.util.List;


public class Logic {
    static Integer getDistance() {
        List<Integer> left = List.of(3,4,2,1,3,3);
        List<Integer> right = List.of(4,3,5,3,9,3);
        int result = 0;
        for (int i = 0; i <= left.size() - 1; i++ ) {
            int leftVal = left.reversed().get(i);
            int rightVal = right.reversed().get(i);
            result += left.reversed().get(i) - right.reversed().get(i);

        }
        return result;
    }
}

