package View.Command;

import Controller.ShopImpl;
import Model.Staff;

import javax.swing.*;

public class ShowGetProduct implements CommandManagementProduct {

    private String name ="Show get product";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute() {
    }
}
