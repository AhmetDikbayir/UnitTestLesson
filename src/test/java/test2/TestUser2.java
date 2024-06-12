package test2;

import jdk.jshell.spi.ExecutionControl;
import mockito1.UserRepo;
import mockito1.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestUser2 {


    @Test
            void testCheckStatus(){
        UserRepo userRepo = mock(UserRepo.class);
        when(userRepo.getEnrolledStatus(123)).thenReturn("SUCCESS");

        UserService userService = new UserService(userRepo);
        String actual = userService.checkEnrolledStatus(123);
        
        assertEquals("STATUS : SUCCESS", actual);
    }

}
