package xyz.danko.adventofcode.day1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    @Test
    void getDistance() {
        assertThat(Logic.getDistance()).isEqualTo(11);
    }
}