package test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test//bu bir test metodudur ve çalıştırılabilir olmasını sağlar.
    public void test() {

    }

    //String classının length metodunu test edelim
    @Test
    void testLength() {
        String str = "Hello World!";
        int realValue = str.length();//12
        int expectedValue = 12;
        assertEquals(expectedValue, realValue, "Wrong length!");
    }

    //Math addExact
    @Test
    void testAddExact() {
        int actual = Math.addExact(5, 8);
        int expected = 13;
        assertEquals(actual,expected, "Wrong Value!");

        int actual1=Math.addExact(-5,8);
        int expected1=3;
        assertEquals(actual1,expected1,"Wrong Value-1!");

        int actual2=Math.addExact(5,-8);
        int expected2=-3;
        assertEquals(actual2,expected2,"Wrong Value-2!");

        int actual3=Math.addExact(-5,-8);
        int expected3=-13;
        assertEquals(actual3,expected3,"Wrong Value-3!");
    }

}
