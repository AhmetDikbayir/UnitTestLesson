package mockito2;

public class UserRepo {

    public String getUSerName(int userId){
        if(userId==1){
            return "Gökhan";
        } else if (userId==2) {
            return "Ayse";
        }
        else {
            return null;
        }
    }
}
