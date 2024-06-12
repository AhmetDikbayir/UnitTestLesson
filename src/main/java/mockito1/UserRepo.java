package mockito1;

import java.util.EventListener;

public class UserRepo {

    public String getEnrolledStatus(int id){

        if(id==123){
            return "SSS";
        } else if (id==456) {
            return "FAILURE";
        } else {
            return "NOT KNOWN";
        }
    }
}
