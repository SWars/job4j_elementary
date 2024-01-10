package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1to8() {
        int[] input = {2, 5, 7, 4, 6, 8, 5, 89, 23, 46};
        int source = 1;
        int destination = 8;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {2, 23, 7, 4, 6, 8, 5, 89, 5, 46};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3to5() {
        int[] input = {13, 21, 56, 15, 23, 12, 17, 44, 23, 46};
        int source = 3;
        int destination = 5;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {13, 21, 56, 12, 23, 15, 17, 44, 23, 46};
        assertThat(result).containsExactly(expected);
    }
}