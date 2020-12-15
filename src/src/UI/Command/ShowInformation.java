package UI.Command;

import Services.ShopImpl;
import Model.Staff;

import javax.swing.*;
import java.util.ArrayList;

public class ShowInformation implements CommandStaff{
    private String name = "Show information";
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
        ArrayList<Staff> temp = shop.getServiceManagementEmployee().getStaffArrayList();
        JTable jTable = new JTable(temp.size(),7);
        JLabel labelStaff = new JLabel("Number of staffs");
        labelStaff.setSize(100,50);
        JTextField textFieldStaff = new JTextField();
        textFieldStaff.setText(String.valueOf(temp.size()));
        int number =0;
        for(Staff staff:temp)
        {
            jTable.setValueAt(staff.getFirstName(),number,0);
            jTable.setValueAt(staff.getLastName(),number,1);
            jTable.setValueAt(staff.getPatronymic(),number,2);
            jTable.setValueAt(staff.getPosition(),number,3);
            jTable.setValueAt(staff.getTelephoneNumber(),number,4);
            jTable.setValueAt(staff.getBankDetais(),number,5);
            jTable.setValueAt(staff.getNumberOfHoursWorked(),number,6);
            number++;
        }
        jPanel.add(labelStaff);
        jPanel.add(textFieldStaff);
        jPanel.add(jTable);
        jFrame.add(jPanel);
        jFrame.setVisible(true);

    }
}
