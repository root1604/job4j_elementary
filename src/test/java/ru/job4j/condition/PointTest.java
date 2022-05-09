package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to19then9() {
        double expected = 9;
        Point a = new Point(1, 0);
        Point b = new Point(1, 9);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to09then8dot06() {
        double expected = 8.06;
        Point a = new Point(1, 1);
        Point b = new Point(0, 9);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to47then2dot83() {
        double expected = 2.83;
        Point a = new Point(2, 5);
        Point b = new Point(4, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when253to471then3dot46() {
        double expected = 3.46;
        Point a = new Point(2, 5, 3);
        Point b = new Point(4, 7, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
