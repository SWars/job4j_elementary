package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart0Finish5ThenSum15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart10Finish5ThenSum0() {
        int start = 10;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1ThenSum1() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart0Finish5ThenSumByEvent6() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart10Finish5ThenSumByEvent0() {
        int start = 10;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1ThenSumByEvent0() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus3Finish5ThenSumByEvent4() {
        int start = -3;
        int finish = 5;
        int result = Counter.sumByEvent(start, finish);
        int expected = 4;
        assertThat(result).isEqualTo(expected);

    }
}