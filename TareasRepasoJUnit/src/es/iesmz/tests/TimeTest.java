package es.iesmz.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {

    @Test
    public void test1() {
        assertEquals(new Time(12, 14, 16), new Time(12, 14, 15).nextSecond());
    }

    @Test
    public void test2() {
        assertEquals(new Time(12, 59, 45), new Time(12, 59, 44).nextSecond());
    }

    @Test
    public void test3() {
        assertEquals(new Time(1, 10, 0), new Time(1, 9, 59).nextSecond());
    }

    @Test
    public void test4() {
        assertEquals(new Time(18, 0, 0), new Time(17, 59, 59).nextSecond());
    }

    @Test
    public void test5() {
        assertEquals(new Time(0, 0, 0), new Time(23, 59, 59).nextSecond());
    }
}