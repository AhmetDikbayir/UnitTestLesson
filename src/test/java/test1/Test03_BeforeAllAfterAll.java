package test1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test03_BeforeAllAfterAll {

    @BeforeAll
    static void beforeAll(){
        System.out.println("****beforeAll çalıştı");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("afterAll çalıştı***");
    }

    @Test
    void testSplit(){
        String[] actual="Junit unit test frameworküdür!".split(" ");
        String[] exp={"Junit","unit","test","frameworküdür!"};
        assertArrayEquals(exp,actual);
    }

    @Test
    void testMin(){
        int act= Math.min(8,1);//1
        int exp=1;
        assertEquals(exp,act);
        assertTrue(Math.min(8,1)==1);
    }

}
