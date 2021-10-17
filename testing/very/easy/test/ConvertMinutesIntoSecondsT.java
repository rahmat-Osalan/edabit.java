package very.easy.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import very.easy.ConvertMinutesIntoSeconds;

public class ConvertMinutesIntoSecondsT {

    @Test
    public void test1() {
        assertEquals(360, ConvertMinutesIntoSeconds.convert(6));
    }

    @Test
    public void test2() {
        assertEquals(240, ConvertMinutesIntoSeconds.convert(4));
    }

    @Test
    public void test3() {
        assertEquals(480, ConvertMinutesIntoSeconds.convert(8));
    }

    @Test
    public void test4() {
        assertEquals(3600, ConvertMinutesIntoSeconds.convert(60));
    }
}
