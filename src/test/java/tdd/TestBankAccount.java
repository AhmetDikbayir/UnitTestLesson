package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestBankAccount {

    /*
        ***********************************
               Banka Hesap Uygulamasi
        ***********************************
        Uygulamada yazilacak metodlar:
            *   Hesap Olusturma
            *   Para Cekme ( Bakiye yetersiz kontrolu, Gunluk Cekim Limiti Kontrolu, Negatif Giris kontrolu )
            *   Para Yatirma ( Negatif Giris kontrolu )
            *   Hesap Gecmisi Alabilme kontrolu
 */

    //hesap olusturma

    @Test
    void testCreateAccount(){
        BankAccount account = new BankAccount("12345",0.0,1000.0);
        assertNotNull(account);
        assertEquals("12345",account.getAccountNumber());
        assertEquals(0.0,account.getBalance());
        assertEquals(1000.0,account.getDailyWithdrawnLimit());
    }
}
