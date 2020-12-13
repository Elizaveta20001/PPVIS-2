package Controller;

import Model.Staff;

import java.util.ArrayList;

public class AuthenticationImpl implements Authenticaion{
    @Override
    public Staff login(String login, String password, ArrayList<Staff> staff)
    {
        for(Staff staff1:staff)
        {
            if(staff1.getLogin().equals(login) && staff1.getPassword().equals(password))
            {
                return staff1;
            }
        }
        return null;
    }

    @Override
    public boolean checkLoginAndPassword(String login, String password,ArrayList<Staff> staff) {
        return false;
    }
}
