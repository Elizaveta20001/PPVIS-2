package View;

import Model.Warehouse;
import View.Command.CommandManagementProduct;
import View.Command.CommandProducts;

import javax.swing.*;
import java.util.ArrayList;

public class FrameManagementProduct {
    private ArrayList<CommandManagementProduct> commandManagementProducts;

    public ArrayList<CommandManagementProduct> getCommandManagementProducts() {
        return commandManagementProducts;
    }

    public void setCommandManagementProducts(ArrayList<CommandManagementProduct> commandManagementProducts) {
        this.commandManagementProducts = commandManagementProducts;
    }
    public void buttonIsPressed(String name)
    {
        for(CommandManagementProduct commandManagementProduct:commandManagementProducts)
        {
            if(commandManagementProduct.getName().equals(name))
            {
                commandManagementProduct.execute();
            }
        }
    }
}
