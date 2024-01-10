package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas25ThenMinus1() {
        int[] data = new int[] {5, 10, 3, 4, 20};
        int element = 25;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}