package very.easy.test;

import org.junit.Test;
import static org.junit.Assert.*;

import very.easy.AreNumberEquals;


public class AreNumberEqualsT {
    @Test
    public void test1(){
        assertTrue(AreNumberEquals.isSameNum(2, 2));
    }
    @Test
    public void test2(){
        assertFalse(AreNumberEquals.isSameNum(0, 6));
    }
    @Test
    public void test3(){
        assertFalse(AreNumberEquals.isSameNum(43, 32));
    }
}
