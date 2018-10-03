package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Week3Test {
    @Test
    void testmax() {
        assertEquals(6,Week3.max(6,5));
        assertEquals(7,Week3.max(6,7));
        assertEquals(0,Week3.max(0,0));
        assertEquals(6,Week3.max(6,0));
        assertEquals(5,Week3.max(0,5));

    }

    @Test
    void testminOfArray() {
        int[] a = { 1,2,3,4,5,6,7,8,9};
        assertEquals(1,Week3.minOfArray(a));
        int[] b = { 1,2,3,4,0,6,7,8,9};
        assertEquals(0,Week3.minOfArray(b));
        int[] c = { 1,2,3,4,5,6,7,8,0};
        assertEquals(0,Week3.minOfArray(c));
        int[] d = { 1,2,3,4,1,6,7,1,9};
        assertEquals(1,Week3.minOfArray(d));
        int[] e = { 1,1,1,1};
        assertEquals(1,Week3.minOfArray(e));
    }

    @Test
    void testcaculatorBMI() {
        assertEquals("Thừa cân",Week3.calculateBMI(67,1.67));
        assertEquals("Thiếu cân",Week3.calculateBMI(40,1.5));
        assertEquals("Bình thường",Week3.calculateBMI(65,1.75));
        assertEquals("Béo phì",Week3.calculateBMI(100,1.8));
        assertEquals("Thiếu cân",Week3.calculateBMI(8.5,0.7));

    }

    // TODO: Viết 5 testcase cho phương thức max()

    // TODO: Viết 5 testcase cho phương thức minOfArray()

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
}
