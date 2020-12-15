package View.Command;

import Controller.ShopImpl;
import Model.Warehouse;

import javax.swing.*;

public class ShowOverdueProducts implements CommandProducts{
    private String name = "Show overdue products";
    private ShopImpl shop;

    public ShopImpl getShop() {
        return shop;
    }

    public void setShop(ShopImpl shop) {
        this.shop = shop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        JFrame frame = new JFrame();
        frame.setSize(1000,500);
        JPanel jpanel1 = new JPanel();
        jpanel1.setLayout(new BoxLayout(jpanel1,BoxLayout.X_AXIS));
        JTable jTable = new JTable(3,7);
        jpanel1.add(jTable);
        frame.add(jpanel1);
        frame.setVisible(true);
    }
}
