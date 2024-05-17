package test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test04_Exceptions {

    @Test
    void testLengthException(){
        String str = "Hello World!";
        str.length();
        String str2 = null;
        assertThrows(NullPointerException.class, ()-> {
            System.out.println("test exception worked");
            str2.length();
        });

        assertDoesNotThrow(()-> {
            System.out.println("test exception worked");
            str2.length();
        });
    }

    @Test
    void testDivide(){
        int num1 = 8;
        int num2 = 0;
        assertThrows(ArithmeticException.class,()->{
            System.out.println(num1/num2);
        });
    }
}
