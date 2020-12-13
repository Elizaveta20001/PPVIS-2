package Controller;

import Model.Staff;

import java.util.ArrayList;

public interface Shop {
    void authentication(String login, String password);
    void startWork();
    void exit();
}
