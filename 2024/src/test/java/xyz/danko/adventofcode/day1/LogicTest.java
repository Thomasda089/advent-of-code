package xyz.danko.adventofcode.day1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LogicTest {

    @Test
    void getDistance() {
        assertThat(Logic.getDistance()).isEqualTo(11);
    }

    @Test
    void getDistanceStream() {
        var list = List.of(
                List.of(3,4,2,1,3,3),
                List.of(4,3,5,3,9,3)
        );
        assertThat(Logic.getDistanceStream(list)).isEqualTo(11);
    }
}