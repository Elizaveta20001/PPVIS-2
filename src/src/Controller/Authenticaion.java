package Controller;

import Model.Staff;

public interface Authenticaion {
    Staff login(String login, String password);
    boolean checkLoginAndPassword(String login, String password);
}
