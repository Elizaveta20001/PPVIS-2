package Controller;

import View.*;
import View.Command.*;

import java.util.ArrayList;

public class Injector {
    private UI ui;
    private ShopImpl shop;
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
        FrameManagementEmployee frameManagementEmployee = new FrameManagementEmployee();
        FrameManagementProduct frameManagementProduct = new FrameManagementProduct();
        FrameShowNumber frameShowNumber = new FrameShowNumber();
        FrameProduct frameProduct = new FrameProduct();
        FrameStaff frameStaff = new FrameStaff();
        AddProduct addProduct = new AddProduct();
        EditProduct editProduct = new EditProduct();
        GetProduct getProduct = new GetProduct();
        GetSalary getSalary = new GetSalary();
        OrderProduct orderProduct = new OrderProduct();
        SellProduct sellProduct = new SellProduct();
        SendProductToShoppingRoom sendProductToShoppingRoom = new SendProductToShoppingRoom();
        ShowAddProduct showAddProduct = new ShowAddProduct();
        ShowEditProduct showEditProduct =new ShowEditProduct();
        ShowFrameGetSalary showFrameGetSalary = new ShowFrameGetSalary();
        ShowGetProduct showGetProduct = new ShowGetProduct();
        ShowInformation showInformation = new ShowInformation();
        ShowManagementProducts showManagementProducts = new ShowManagementProducts();
        ShowOrderProduct showOrderProduct = new ShowOrderProduct();
        ShowOverdueProducts showOverdueProducts = new ShowOverdueProducts();
        ShowSellProduct showSellProduct = new ShowSellProduct();
        ShowSendProductToShoppingRoom showSendProductToShoppingRoom = new ShowSendProductToShoppingRoom();

        ArrayList<CommandStaff> commandStaffArrayList = new ArrayList<>();
        commandStaffArrayList.add(showInformation);
        commandStaffArrayList.add(showFrameGetSalary);
        commandStaffArrayList.add(getSalary);
        frameStaff.setCommandStaffs(commandStaffArrayList);

        ArrayList<CommandManagementProduct> commandManagementProductArrayList = new ArrayList<>();
        commandManagementProductArrayList.add(addProduct);
        commandManagementProductArrayList.add(showAddProduct);
        commandManagementProductArrayList.add(showManagementProducts);
        commandManagementProductArrayList.add(sendProductToShoppingRoom);
        commandManagementProductArrayList.add(showSendProductToShoppingRoom);
        commandManagementProductArrayList.add(orderProduct);
        commandManagementProductArrayList.add(showOrderProduct);
        commandManagementProductArrayList.add(getProduct);
        commandManagementProductArrayList.add(showGetProduct);
        commandManagementProductArrayList.add(sellProduct);
        commandManagementProductArrayList.add(showSellProduct);
        commandManagementProductArrayList.add(editProduct);
        commandManagementProductArrayList.add(showEditProduct);
        frameManagementProduct.setCommandManagementProducts(commandManagementProductArrayList);

        ArrayList<CommandProducts> commandProductsArrayList = new ArrayList<>();
        commandProductsArrayList.add(showOverdueProducts);
        frameProduct.setCommandStaffs(commandProductsArrayList);

        ui.setFrameManagementEmployee(frameManagementEmployee);
        ui.setFrameManagementProduct(frameManagementProduct);
        ui.setFrameProduct(frameProduct);
        ui.setFrameShowNumber(frameShowNumber);
        ui.setFrameStaff(frameStaff);

    }

    public ShopImpl getShop() {
        return shop;
    }

    public UI getUi() {
        return ui;
    }
}
