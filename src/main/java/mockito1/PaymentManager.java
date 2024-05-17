package mockito1;

public class PaymentManager {

    //geçmiş ödeme durumu
    public String getPaymentStatus(int paymentID){
        //123,456
        if (paymentID==123){
            return "SUCCESS";
        } else if (paymentID==456) {
            return "FAILURE";
        }else {
            return "UNKNOWN";
        }
    }
}
