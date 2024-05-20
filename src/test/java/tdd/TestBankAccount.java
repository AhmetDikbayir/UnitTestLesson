package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
public class TestBankAccount {

    //hesap oluşturma

    @Test
    void testCreateAccount(){
        BankAccount account=new BankAccount("12345",0.0,1000.0);
        assertNotNull(account);
        assertEquals("12345",account.getAccountNumber());
        assertEquals(0.0,account.getBalance());
        assertEquals(1000.0,account.getDailyWithdrawnLimit());
    }

    //para yatırma testleri
    @Test
    void testDeposit(){

        //given
        BankAccount account=new BankAccount("12345",100.0,1000.0);
        int size=account.getHistory().size();

        //when
        account.deposit(200.0);//balance+200

        //then
        assertEquals(300.0,account.getBalance());
        assertEquals(size+1,account.getHistory().size());

    }
    //pozitif olmayan miktar ile para yatırma testi
    @Test
    void testDepositWithNonPositiveAmount(){

        BankAccount account=new BankAccount("12345",100.0,1000.0);
        int size=account.getHistory().size();

        assertThrows(RuntimeException.class,()->account.deposit(-100));
        assertEquals(100.0,account.getBalance());
        assertEquals(size,account.getHistory().size());
    }

    //para çekme testleri
    @Test
    void testWithdraw(){

        BankAccount account=new BankAccount("12345",500.0,1000.0);

        int size=account.getHistory().size();


        assertTrue(account.withdraw(200.0));
        assertEquals(300.0,account.getBalance());
        assertEquals(size+1,account.getHistory().size());

    }


    //yetersiz bakiye
    @Test
    void testWithdrawInSufficientBalance(){

        BankAccount account=new BankAccount("12345",500.0,1000.0);
        int size=account.getHistory().size();

        assertFalse(account.withdraw(600.0));
        assertEquals(500.0,account.getBalance());
        assertEquals(size,account.getHistory().size());
    }

    //günlük limit aşılırsa
    @Test
    void testWithdrawWithDailyLimit(){
        BankAccount account=new BankAccount("12345",1500.0,1000.0);
        int size=account.getHistory().size();

        assertTrue( account.withdraw(1000.0));//kalan:500
        assertFalse(account.withdraw(500.0));
        assertEquals(500.0,account.getBalance());
        assertEquals(size+1,account.getHistory().size());
    }

    //pozitif olmayan miktarda para çekme
    @Test
    void testWithdrawWithNonPositiveAmount(){

        BankAccount account=new BankAccount("12345",1500.0,1000.0);
        int size=account.getHistory().size();

        assertFalse(account.withdraw(-200.0));
        assertEquals(1500.0,account.getBalance());
        assertEquals(size,account.getHistory().size());
    }

    //işlem geçmişini alma
    @Test
    void testGetHistory(){
        BankAccount account=new BankAccount("12345",1500.0,1000.0);
        int size=account.getHistory().size();

        account.withdraw(200.0);//+1
        account.deposit(500.0);//+1

        assertEquals(size+2,account.getHistory().size());
        assertTrue(account.getHistory().contains("Para yatırma : "+500.0));

    }




}