package Controller;

import Model.Product;
import Model.Role;
import Model.Staff;
import View.*;
import View.Command.*;

import java.util.ArrayList;

public class Injector {
    private UI ui;
    private ShopImpl shop;
    public Injector(){
        ui = new UI();
        shop = new ShopImpl();

        ServiceManagementEmployeeImpl serviceManagementEmployee = new ServiceManagementEmployeeImpl();
        ServiceManagementProducts serviceManagementProducts = new ServiceManagmentProductsImpl();
        Authenticaion authenticaion = new AuthenticationImpl();

        Staff staff = new Staff("1234","1234","Елизавета","Ковель","Петровна","Генеральный директор","3568","2222");
        Staff staff1 = new Staff("123","123","Олег","Манкевич","Александрович","Генеральный директор","3568","2222");
        staff.setRole(Role.administrator);
        staff1.setRole(Role.manager);
        ArrayList<Staff> staffArrayList = new ArrayList<>();
        staffArrayList.add(staff);
        staffArrayList.add(staff1);
        serviceManagementEmployee.setStaffArrayList(staffArrayList);

        shop.setServiceManagementEmployee(serviceManagementEmployee);
        shop.setServiceManagementProducts(serviceManagementProducts);
        shop.setAuthenticaion(authenticaion);


        FrameManagementEmployee frameManagementEmployee = new FrameManagementEmployee();
        frameManagementEmployee.setShop(shop);
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
        showInformation.setShop(shop);
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

        //shop.setStaff(staffArrayList);
        ui.setShop(shop);
    }

    public ShopImpl getShop() {
        return shop;
    }

    public UI getUi() {
        return ui;
    }
}
