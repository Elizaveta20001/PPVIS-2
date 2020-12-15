package Services;

import Model.Staff;

import java.util.ArrayList;

public class ShopImpl implements Shop{

    private ServiceManagmentProductsImpl serviceManagementProducts;
    private ServiceManagementEmployeeImpl serviceManagementEmployee;
    private Authenticaion authenticaion;
    private Staff currentStaff;

    public Authenticaion getAuthenticaion() {
        return authenticaion;
    }

    public void setAuthenticaion(Authenticaion authenticaion) {
        this.authenticaion = authenticaion;
    }



    public ServiceManagementEmployeeImpl getServiceManagementEmployee() {
        return serviceManagementEmployee;
    }

    public ServiceManagmentProductsImpl getServiceManagementProducts() {
        return serviceManagementProducts;
    }

    public Staff getCurrentStaff() {
        return currentStaff;
    }

    public void setCurrentStaff(Staff currentStaff) {
        this.currentStaff = currentStaff;
    }

    public void setServiceManagementEmployee(ServiceManagementEmployeeImpl serviceManagementEmployee) {
        this.serviceManagementEmployee = serviceManagementEmployee;
    }

    public void setServiceManagementProducts(ServiceManagmentProductsImpl serviceManagementProducts) {
        this.serviceManagementProducts = serviceManagementProducts;
    }



    @Override
    public void authentication(String login, String password,ArrayList<Staff> staff) {
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
