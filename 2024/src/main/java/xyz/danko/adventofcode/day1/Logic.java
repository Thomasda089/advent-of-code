package xyz.danko.adventofcode.day1;

import java.util.List;
import java.util.stream.IntStream;



public class Logic {
    static Integer getDistance() {
        List<Integer> left = List.of(3,4,2,1,3,3);
        List<Integer> right = List.of(4,3,5,3,9,3);
        int result = 0;
        for (int i = 0; i <= left.size() - 1; i++ ) {
            int leftVal = left.stream().sorted().toList().get(i);
            int rightVal = right.stream().sorted().toList().get(i);
            result += leftVal > rightVal ? leftVal - rightVal : rightVal - leftVal;

        }
        return result;
    }

    static Integer getDistanceStream(List<List<Integer>> list) {
        return IntStream.range(0, list.get(0).size())
                .map(i -> list.stream()
                        .map(l -> l.stream().sorted().toList().get(i))
                        .reduce((a, b) -> Math.abs(a - b))
                        .orElseThrow(() -> new ArrayIndexOutOfBoundsException("Damn Son")))
                .sum();
    }
}


