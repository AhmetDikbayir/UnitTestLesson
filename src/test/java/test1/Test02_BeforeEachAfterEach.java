package test1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test02_BeforeEachAfterEach {

    String str;
    @BeforeEach
    void beforeEach(){
        str = "JUnit";
        System.out.println("beforeEach is working");
    }

    @AfterEach
    void afterEach(){
        str= null;
        System.out.println("afterEach is working");
    }

    @Test
    void testUpperCase(){
        String actual = str.toUpperCase();
        String expected= "JUNİT";
        assertEquals(actual,expected);
    }

    @Test
    void testContains(){
        boolean actual = str.contains("a");
        boolean expected = false;
        assertEquals(expected,actual, "the test failed");
        //directly can be used
        assertEquals(false,str.contains("a"));
        assertFalse(str.contains("a"));
        assertTrue(str.contains("U"));
    }

}
