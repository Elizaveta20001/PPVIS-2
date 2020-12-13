package Controller;

import Model.Staff;

import java.util.ArrayList;

public class ShopImpl implements Shop{
    private ArrayList<Staff> staff;
    private ServiceManagementProducts serviceManagementProducts;
    private ServiceManagementEmployee serviceManagementEmployee;
    private Authenticaion authenticaion;
    private Staff currentStaff;

    public Authenticaion getAuthenticaion() {
        return authenticaion;
    }

    public void setAuthenticaion(Authenticaion authenticaion) {
        this.authenticaion = authenticaion;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public ServiceManagementEmployee getServiceManagementEmployee() {
        return serviceManagementEmployee;
    }

    public ServiceManagementProducts getServiceManagementProducts() {
        return serviceManagementProducts;
    }

    public Staff getCurrentStaff() {
        return currentStaff;
    }

    public void setCurrentStaff(Staff currentStaff) {
        this.currentStaff = currentStaff;
    }

    public void setServiceManagementEmployee(ServiceManagementEmployee serviceManagementEmployee) {
        this.serviceManagementEmployee = serviceManagementEmployee;
    }

    public void setServiceManagementProducts(ServiceManagementProducts serviceManagementProducts) {
        this.serviceManagementProducts = serviceManagementProducts;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }

    @Override
    public void authentication(String login, String password) {
        currentStaff = authenticaion.login(login,password,staff);
        System.out.println(currentStaff.getFirstName());
    }

    @Override
    public void startWork() {

    }

    @Override
    public void exit() {

    }
}
