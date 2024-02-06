package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when01to10then1Dot41() {
        double expected = 1.41;
        Point a = new Point(0, 1);
        Point b = new Point(1, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when15to25then1() {
        double expected = 1;
        Point a = new Point(1, 5);
        Point b = new Point(2, 5);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10to01then1Dot41() {
        double expected = 1.41;
        Point a = new Point(1, 0);
        Point b = new Point(0, 1);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000to020then2() {
        double expected = 2;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 0);
        Point c = new Point(0, 0, 2);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when251to252then1() {
        double expected = 1;
        Point a = new Point(1, 5, 3);
        Point b = new Point(2, 5, 1);
        Point c = new Point(2, 5, 2);
        double output = b.distance3d(c);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}