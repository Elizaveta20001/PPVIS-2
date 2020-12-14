package Controller;

import Model.Role;
import Model.Staff;

import java.util.ArrayList;

public class ServiceManagementEmployeeImpl implements ServiceManagementEmployee {
    private ArrayList<Staff> staffArrayList;

    public ArrayList<Staff> getStaffArrayList() {
        return staffArrayList;
    }

    public void setStaffArrayList(ArrayList<Staff> staffArrayList) {
        this.staffArrayList = staffArrayList;
    }

    @Override
    public void addStaff(String login, String password, String firstName, String secondName, String patrinymic, String position, String telephoneNumber,String bankDetails, String role) {

        Staff staff = new Staff(login,password,firstName,secondName,patrinymic,position,telephoneNumber,bankDetails);
        if (role.equals(Role.administrator.toString()))
        {
            staff.setRole(Role.administrator);
        }
        else
        {
            staff.setRole(Role.manager);
        }
        staffArrayList.add(staff);




    }

    @Override
    public void editStaff(Staff staff, String firstName, String secondName, String patrinymic, String position, String telephoneNumber,String bankDetails, int numberOfHours) {
        for(Staff staffs:staffArrayList)
        {
            if(staffs.equals(staff))
            {
                staffs.setFirstName(firstName);
                staffs.setLastName(secondName);
                staffs.setPatronymic(patrinymic);
                staffs.setPosition(position);
                staffs.setTelephoneNumber(telephoneNumber);
                staffs.setBankDetais(bankDetails);
                staffs.setNumberOfHoursWorked(numberOfHours);
            }
        }
    }

    @Override
    public void deleteStaff(Staff staff) {
        staffArrayList.remove(staff);

    }

    @Override
    public ArrayList<Staff> sendToVacation() {
        ArrayList<Staff> result = new ArrayList<>();
        for(Staff staff:staffArrayList)
        {
            if(staff.getNumberOfHoursWorked() > 500)
            {
                result.add(staff);
            }
        }
        return result;
    }

    @Override
    public ArrayList<Staff> showInformation() {
        return staffArrayList;
    }

    @Override
    public float sendSalary(Staff staff) {
        return staff.getNumberOfHoursWorked() * 250;
    }
}
