package Services;

import Model.Staff;

import java.util.ArrayList;

public interface Authenticaion {
    Staff login(String login, String password,ArrayList<Staff> staff);
    boolean checkLoginAndPassword(String login, String password, ArrayList<Staff> staff);
}
