package test2;

import mockito1.PaymentManager;
import mockito1.PaymentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TestPaymentService {

    //checkPaymentStatus metodunu test edelim: POSITIVE SCENARIO

    @Test
    void testCheckPaymentStatus(){
        //1-mock(sahte) bir PM objesine ihitiyacımız var
        PaymentManager pm = mock(PaymentManager.class);//sahte PM
        //sahte(dublör) PM' a davranıs sekillerini set etmeliyiz.
        when(pm.getPaymentStatus(123)).thenReturn("SUCCESS");

        //2-payment service objesi oluşturalım
        PaymentService paymentService = new PaymentService(pm);
        String actual = paymentService.checkPaymentStatus(123);
        assertEquals("STATUS : SUCCESS", actual);

        verify(pm,times(1)).getPaymentStatus(123);

    }
}
