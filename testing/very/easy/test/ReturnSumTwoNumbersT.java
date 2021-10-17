package very.easy.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import very.easy.ReturnSumTwoNumbers;

public class ReturnSumTwoNumbersT {
    @Test
    public void test1(){
        int expected = 5;
        int actual = ReturnSumTwoNumbers.sum(3, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        int expected = -9;
        int actual = ReturnSumTwoNumbers.sum(-3, -6);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        int expected = 10;
        int actual = ReturnSumTwoNumbers.sum(7, 3);
        assertEquals(expected, actual);
    }
}
