package test1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

public class Test06_PerformanceTest {
    @Test
    void testPerformancePrintNumbers(){
        //1-100000
        Assertions.assertTimeout(Duration.ofSeconds(2), ()->{
            IntStream.rangeClosed(1,2000001).forEach(System.out::println);
        });
    }
}
