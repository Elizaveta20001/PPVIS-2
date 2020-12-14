package Controller;

import Model.Role;
import Model.Staff;

import java.util.ArrayList;

public interface ServiceManagementEmployee {

        void addStaff(String login, String password, String firstName, String secondName, String patrinymic, String position, String telephoneNumber, String bankDetails,String role);

        void deleteStaff(Staff staff);
        ArrayList<Staff> sendToVacation();
        ArrayList<Staff> showInformation();
        float sendSalary(Staff staff);
        void editStaff(Staff staff,String firstName, String secondName, String patrinymic, String position, String telephoneNumber,String bankDetails, int numberOfHours);
}
