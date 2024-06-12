package mockito1;

import javax.swing.plaf.PanelUI;

public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public String checkEnrolledStatus(int id){
        String status = userRepo.getEnrolledStatus(id);
        String str = "STATUS : ";
        return str+status;
    }
}
