package View;

import Controller.ShopImpl;
import Model.ShoppingRoom;
import Model.Warehouse;

import javax.swing.*;

public class FrameShowNumber {
    private ShopImpl shop;

    public ShopImpl getShop() {
        return shop;
    }

    public void setShop(ShopImpl shop) {
        this.shop = shop;
    }

    public void showNumber()
    {
        JFrame frame = new JFrame();
        frame.setSize(1000,500);
        JPanel jpanel1 = new JPanel();
        jpanel1.setLayout(new BoxLayout(jpanel1,BoxLayout.X_AXIS));

        JButton buttonShowProductInWarehouse = new JButton();
        buttonShowProductInWarehouse.setText("Show products in warehouse");
        buttonShowProductInWarehouse.setSize(1000,50);
        buttonShowProductInWarehouse.addActionListener(actionEvent -> {

            frame.dispose();
            showNumberOfProductsInWarehouse();
        });
        JButton  buttonShowProductInShoppingRoom= new JButton();
        buttonShowProductInShoppingRoom.setText("Show products in shopping room");
        buttonShowProductInShoppingRoom.setSize(1000,50);
        buttonShowProductInShoppingRoom.addActionListener(actionEvent -> {
            frame.dispose();
            showNumberOfProductsInShoppingRoom();
        });


        jpanel1.add(buttonShowProductInShoppingRoom);
        jpanel1.add(buttonShowProductInWarehouse);
        frame.add(jpanel1);
        frame.setVisible(true);
    }
    public void showNumberOfProductsInWarehouse()
    {
        JFrame frame = new JFrame();
        frame.setSize(1000,500);
        JPanel jpanel1 = new JPanel();
        jpanel1.setLayout(new BoxLayout(jpanel1,BoxLayout.X_AXIS));
        Warehouse warehouse = shop.getServiceManagementProducts().getWarehouse();
        JTable jTable = new JTable(warehouse.getListOfProductsInWarehose().size(),8);
        JButton  buttonBack= new JButton();
        buttonBack.setText("Back");
        buttonBack.setSize(1000,50);
        buttonBack.addActionListener(actionEvent -> {
            frame.dispose();
            showNumber();
        });

        jpanel1.add(jTable);
        jpanel1.add(buttonBack);
        frame.add(jpanel1);
        frame.setVisible(true);
    }
    public void showNumberOfProductsInShoppingRoom()
    {
        JFrame frame = new JFrame();
        frame.setSize(1000,500);
        JPanel jpanel1 = new JPanel();
        jpanel1.setLayout(new BoxLayout(jpanel1,BoxLayout.X_AXIS));
        ShoppingRoom shoppingRoom = shop.getServiceManagementProducts().getShoppingRoom();
        JTable jTable = new JTable(shoppingRoom.getListOfProductsInShop().size(),7);
        JButton  buttonBack= new JButton();
        buttonBack.setText("Back");
        buttonBack.setSize(1000,50);
        buttonBack.addActionListener(actionEvent -> {
            frame.dispose();
            showNumber();
        });

        jpanel1.add(jTable);
        jpanel1.add(buttonBack);
        frame.add(jpanel1);
        frame.setVisible(true);
    }
}
