package test2;

import mockito2.UserRepo;
import mockito2.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;


public class TestUserService {

    //getUser metodunu test edelim
    //1- id=1 return: Dear: Gökhan
    //2- 1 kere getUserName metodu çağrılmış olmalı
    //3- id=99 throws:RuntimeException
    @Test
    void testGetUser(){

        UserRepo repo = mock(UserRepo.class);
        when(repo.getUSerName(1)).thenReturn("Gökhan");
        when(repo.getUSerName(99)).thenReturn(null);

        UserService userService=new UserService(repo);

        //id=1
        String userName=userService.getUser(1);
        assertEquals("Dear Gökhan",userName);
        verify(repo).getUSerName(1);

        //id=99
        assertThrows(RuntimeException.class, ()->userService.getUser(99));
        verify(repo).getUSerName(99);

    }
}
