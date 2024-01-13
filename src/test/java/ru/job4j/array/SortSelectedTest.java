package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSortWith5Elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWith3Elements() {
        int[] data = new int[] {15, 7, 21};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 15, 21};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWith4Elements() {
        int[] data = new int[] {17, 13, 12, 11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {11, 12, 13, 17};
        assertThat(result).containsExactly(expected);
    }
}