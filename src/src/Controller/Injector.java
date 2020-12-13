package Controller;

import UI.UI;

public class Injector {
    public Injector(){
        UI ui = new UI();
        ShopImpl shop = new ShopImpl();

        ServiceManagementEmployee serviceManagementEmployee = new ServiceManagementEmployeeImpl();
        ServiceManagementProducts serviceManagementProducts = new ServiceManagmentProductsImpl();
        Authenticaion authenticaion = new AuthenticationImpl();

        shop.setServiceManagementEmployee(serviceManagementEmployee);
        shop.setServiceManagementProducts(serviceManagementProducts);
        shop.setAuthenticaion(authenticaion);

        ui.setShop(shop);
    }

}
