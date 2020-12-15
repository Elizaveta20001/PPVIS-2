package View.Command;

import Controller.ShopImpl;
import Model.Staff;

import javax.swing.*;

public class ShowFrameGetSalary implements CommandStaff {
    private String name = "Show frame get salary";
    private ShopImpl shop;

    public void setShop(ShopImpl shop) {
        this.shop = shop;
    }

    public ShopImpl getShop() {
        return shop;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(1000,500);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));
        JComboBox<String> jComboBox = new JComboBox<>();
        for(Staff staff: shop.getServiceManagementEmployee().getStaffArrayList())
        {
            jComboBox.addItem(staff.getLastName());
        }
        JButton jButton = new JButton();
        jButton.setSize(400,50);
        jButton.setText("Send salary");
        jButton.addActionListener(actionEvent ->
        {
            ///
        });
        jPanel.add(jComboBox);
        jPanel.add(jButton);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
