package Services;

import Model.Staff;

import java.util.ArrayList;

public interface Shop {
    void authentication(String login, String password,ArrayList<Staff> staff);
    void startWork();
    void exit();
}
