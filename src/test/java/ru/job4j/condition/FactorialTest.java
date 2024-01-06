package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int number = 5;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int output = Factorial.calculate(number);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForOneThenOne() {
        int number = 1;
        int output = Factorial.calculate(number);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForThreeThenSix() {
        int number = 3;
        int output = Factorial.calculate(number);
        int expected = 6;
        assertThat(output).isEqualTo(expected);
    }
}