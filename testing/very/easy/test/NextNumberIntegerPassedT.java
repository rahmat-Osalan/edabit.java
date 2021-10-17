package very.easy.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import very.easy.NextNumberIntegerPassed;

public class NextNumberIntegerPassedT {
    @Test
    public void test1() {
        System.out.println("2 plus 1 equals 3.");
        assertEquals(3, NextNumberIntegerPassed.addition(2));
    }

    @Test
    public void test2() {
        System.out.println("-8 plus 1 equals 9.");
        assertEquals(-8, NextNumberIntegerPassed.addition(-9));
    }

    @Test
    public void test3() {
        System.out.println("0 plus 1 equals 1.");
        assertEquals(1, NextNumberIntegerPassed.addition(0));
    }

    @Test
    public void test4() {
        System.out.println("999 plus 1 equals 1000.");
        assertEquals(1000, NextNumberIntegerPassed.addition(999));
    }

    @Test
    public void test5() {
        System.out.println("73 plus 1 equals 74.");
        assertEquals(74, NextNumberIntegerPassed.addition(73));
    }
}
