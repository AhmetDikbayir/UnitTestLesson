package test1;

import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test05_RepeatedTest {

    //test tekrarlamak istersek
    @RepeatedTest(5)
    void testSubstring(){
        assertEquals("Java", "Java is beautiful".substring(0,4));
    }

    //repeated testler genellikle random değerler ile test için kullanılır
    @RepeatedTest(5)
    void testAddExact(){
        Random random = new Random();
        int sayi1 = random.nextInt(100);
        int sayi2 = random.nextInt(100);
        assertEquals(sayi1+sayi2, Math.addExact(sayi1,sayi2));
        System.out.println("sayi1 : " + sayi1 + "sayi2 : " + sayi2);

    }
}
