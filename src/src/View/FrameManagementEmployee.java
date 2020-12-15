package View;

import Controller.ShopImpl;
import Model.Role;
import Model.Staff;

import javax.swing.*;
import java.awt.*;
import java.beans.JavaBean;
import java.util.ArrayList;

public class FrameManagementEmployee {
    private ShopImpl shop;

    public ShopImpl getShop() {
        return shop;
    }

    public void setShop(ShopImpl shop) {
        this.shop = shop;
    }

    public void showFrameManagementEmployee()
    {
        JFrame jframe = new JFrame();
        jframe.setSize(1000,500);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.X_AXIS));
        JButton jButton = new JButton();
        jButton.setText("Add staff");
        jButton.setSize(1000,50);
        jButton.addActionListener(actionEvent ->
        {
            jframe.dispose();
            showAddStaffFrame();
        });
        JButton jButtonDelete = new JButton();
        jButtonDelete.setText("Delete staff");
        jButtonDelete.setSize(1000,50);
        jButtonDelete.addActionListener(actionEvent ->
        {
            jframe.dispose();
            showDeleteStaffFrame();
        });
        JButton jButtonEdit = new JButton();
        jButtonEdit.setText("Edit staff");
        jButtonEdit.setSize(1000,50);
        jButtonEdit.addActionListener(actionEvent ->
        {
            jframe.dispose();
            showEditStaffFrame();
        });
        JButton jButtonVacation = new JButton();
        jButtonVacation.setText("Vacation staff");
        jButtonVacation.setSize(1000,50);
        jButtonVacation.addActionListener(actionEvent ->
        {
            jframe.dispose();
            showVacationFrame();
        });

        jPanel.add(jButton);
        jPanel.add(jButtonDelete);
        jPanel.add(jButtonEdit);
        jPanel.add(jButtonVacation);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }
    public void showAddStaffFrame()
    {
        JFrame jframe = new JFrame();
        jframe.setSize(1000,1000);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));

        JLabel labelName = new JLabel("Name");
        labelName.setSize(100,50);
        JTextField textFieldName = new JTextField();
        textFieldName.setMaximumSize(new Dimension(100,50));

        JLabel labelLastName = new JLabel("LastName");
        labelLastName.setSize(100,50);
        JTextField textFieldLastName = new JTextField();
        textFieldLastName.setMaximumSize(new Dimension(100,50));

        JLabel labelPatronymic = new JLabel("Patronymic");
        labelPatronymic.setSize(100,50);
        JTextField textFieldPatronymic = new JTextField();
        textFieldPatronymic.setMaximumSize(new Dimension(100,50));

        JLabel labelPosition= new JLabel("Position");
        labelPosition.setSize(100,50);
        JTextField textFieldPosition = new JTextField();
        textFieldPosition.setMaximumSize(new Dimension(100,50));

        JLabel labelTelephoneNumber= new JLabel("Telephone number");
        labelTelephoneNumber.setSize(100,50);
        JTextField textFieldTelephoneNumber = new JTextField();
        textFieldTelephoneNumber.setMaximumSize(new Dimension(100,50));

        JLabel labelBankDetails= new JLabel("Bank Details");
        labelBankDetails.setSize(100,50);
        JTextField textFieldBankDetails = new JTextField();
        textFieldBankDetails.setMaximumSize(new Dimension(100,50));

        JLabel labelLogin= new JLabel("Login");
        labelLogin.setSize(100,50);
        JTextField textFieldLogin = new JTextField();
        textFieldLogin.setMaximumSize(new Dimension(100,50));

        JLabel labelPassword= new JLabel("Password");
        labelPassword.setSize(100,50);
        JTextField textFieldPassword = new JTextField();
        textFieldPassword.setMaximumSize(new Dimension(100,50));
        ArrayList<JRadioButton> radioButtons= new ArrayList<>();

        JRadioButton radioButton1 = new JRadioButton();
        radioButton1.setText("administrator");

        JRadioButton radioButton2 = new JRadioButton();
        radioButton2.setText("manager");

        JButton button = new JButton("Add staff");
        button.setMaximumSize(new Dimension(100,50));

        button.addActionListener(actionEvent ->
        {
            jframe.dispose();
            JRadioButton temp = new JRadioButton();
            for(JRadioButton radioButton:radioButtons)
            {
                if(radioButton.isSelected())
                {
                    temp = radioButton;
                }
            }
            if(textFieldName.getText().equals("") || textFieldLastName.getText().equals("") || textFieldPatronymic.getText().equals("") || textFieldPosition.getText().equals("") || textFieldTelephoneNumber.getText().equals("") || textFieldBankDetails.getText().equals(""))
            {
                System.out.println("Ошибка");
            }
            else{

            shop.getServiceManagementEmployee().addStaff(textFieldLogin.getText(),textFieldPassword.getText(),textFieldName.getText(),textFieldLastName.getText(),textFieldPatronymic.getText(),textFieldPosition.getText(),textFieldTelephoneNumber.getText(),textFieldBankDetails.getText(),temp.getText());
            showFrameManagementEmployee();
            }

        });
        JButton buttonBack = new JButton("Back");
        buttonBack.setSize(100,50);
        buttonBack.addActionListener(actionEvent ->
        {
            jframe.dispose();
            showFrameManagementEmployee();
        });

        jPanel.add(labelName);
        jPanel.add(textFieldName);
        jPanel.add(labelLastName);
        jPanel.add(textFieldLastName);
        jPanel.add(labelPatronymic);
        jPanel.add(textFieldPatronymic);
        jPanel.add(labelPosition);
        jPanel.add(textFieldPosition);
        jPanel.add(labelTelephoneNumber);
        jPanel.add(textFieldTelephoneNumber);
        jPanel.add(labelBankDetails);
        jPanel.add(textFieldBankDetails);
        jPanel.add(labelLogin);
        jPanel.add(textFieldLogin);
        jPanel.add(labelPassword);
        jPanel.add(textFieldPassword);
        jPanel.add(radioButton1);
        jPanel.add(radioButton2);
        jPanel.add(button);
        jPanel.add(buttonBack);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }
    public void showDeleteStaffFrame()
    {
        JFrame jframe = new JFrame();
        jframe.setSize(1000,1000);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));
        JComboBox<String> staffJComboBox= new JComboBox<>();
        staffJComboBox.setMaximumSize(new Dimension(100,50));
        for (Staff staff: shop.getServiceManagementEmployee().getStaffArrayList())
        {
            staffJComboBox.addItem(staff.getLastName());
        }
        JButton button = new JButton("Delete");
        button.setSize(100,50);
        button.addActionListener(actionEvent ->
        {

            for (Staff staff: shop.getServiceManagementEmployee().getStaffArrayList())
            {
                if(staffJComboBox.getSelectedItem().toString().equals(staff.getLastName()))
                {
                    jframe.dispose();
                    deleteStaff(staff);
                    shop.getServiceManagementEmployee().deleteStaff(staff);
                }


            }
            System.out.println(shop.getServiceManagementEmployee().getStaffArrayList().size());

            jframe.dispose();
        });
        JButton buttonBack = new JButton("Back");
        buttonBack.setSize(100,50);
        buttonBack.addActionListener(actionEvent ->
        {
            jframe.dispose();
            showFrameManagementEmployee();
        });
        jPanel.add(staffJComboBox);
        jPanel.add(button);
        jPanel.add(buttonBack);


        jframe.add(jPanel);
        jframe.setVisible(true);
    }
    public void showEditStaffFrame()
    {
        JFrame jframe = new JFrame();
        jframe.setSize(1000,1000);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));
        JComboBox<String> staffJComboBox= new JComboBox<>();
        staffJComboBox.setMaximumSize(new Dimension(100,50));
        for (Staff staff: shop.getServiceManagementEmployee().getStaffArrayList())
        {
            staffJComboBox.addItem(staff.getLastName());
        }
        JButton button = new JButton("Edit");
        button.setSize(100,50);
        button.addActionListener(actionEvent ->
        {

            for (Staff staff: shop.getServiceManagementEmployee().getStaffArrayList())
            {
                if(staffJComboBox.getSelectedItem().toString().equals(staff.getLastName()))
                {
                    jframe.dispose();
                    editStaff(staff);
                }


            }



        });
        JButton buttonBack = new JButton("Back");
        buttonBack.setSize(100,50);
        buttonBack.addActionListener(actionEvent ->
        {
            jframe.dispose();
            showFrameManagementEmployee();
        });
        jPanel.add(staffJComboBox);
        jPanel.add(button);
        jPanel.add(buttonBack);


        jframe.add(jPanel);
        jframe.setVisible(true);

    }
    public void showVacationFrame()
    {
        JFrame jframe = new JFrame();
        jframe.setSize(1000,1000);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));
        ArrayList<Staff> temp = shop.getServiceManagementEmployee().sendToVacation();
        JTable jTable = new JTable(temp.size(),7);
        int number = 0;
        for(Staff staff: temp)
        {
            jTable.setValueAt(staff.getFirstName(),number,0);
            jTable.setValueAt(staff.getLastName(),number,1);
            jTable.setValueAt(staff.getPatronymic(),number,2);
            jTable.setValueAt(staff.getPosition(),number,3);
            jTable.setValueAt(staff.getTelephoneNumber(),number,4);
            jTable.setValueAt(staff.getBankDetais(),number,5);
            jTable.setValueAt(staff.getNumberOfHoursWorked(),number,6);

        }
        JButton button = new JButton("Back");
        button.setSize(100,50);
        button.addActionListener(actionEvent ->
        {
            jframe.dispose();
            showFrameManagementEmployee();
        });
        jPanel.add(jTable);
        jPanel.add(button);
        jframe.add(jPanel);
        jframe.setVisible(true);

    }
    public void addStaff()
    {
        ///лишняя
    }
    public void deleteStaff(Staff staff)
    {
        JFrame jframe = new JFrame();
        jframe.setSize(1000,1000);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));

        JLabel labelName = new JLabel("Выбранный сотрудник");
        labelName.setSize(100,50);
        JTextField textFieldName = new JTextField();
        textFieldName.setMaximumSize(new Dimension(100,50));
        textFieldName.setText(staff.getLastName());

        JLabel labelHours = new JLabel("Количесвто отработанных часов");
        labelHours.setSize(100,50);
        JTextField textFieldHours= new JTextField();
        textFieldHours.setMaximumSize(new Dimension(100,50));
        textFieldHours.setText(String.valueOf(staff.getNumberOfHoursWorked()));

        JLabel labelSalary = new JLabel("Зарплата");
        labelSalary.setSize(100,50);
        JTextField textFieldSalary= new JTextField();
        textFieldHours.setMaximumSize(new Dimension(100,50));
        textFieldHours.setText(String.valueOf(shop.getServiceManagementEmployee().sendSalary(staff)));

        JButton button = new JButton("Back");
        button.setSize(100,50);
        button.addActionListener(actionEvent ->
        {
            jframe.dispose();
            showFrameManagementEmployee();
        });

        jPanel.add(labelName);
        jPanel.add(textFieldName);
        jPanel.add(labelHours);
        jPanel.add(textFieldHours);
        jPanel.add(labelSalary);
        jPanel.add(textFieldSalary);
        jPanel.add(button);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }

    public  void editStaff(Staff staff)
    {
        JFrame jframe = new JFrame();
        jframe.setSize(1000,1000);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));

        JLabel labelName = new JLabel("Name");
        labelName.setSize(100,50);
        JTextField textFieldName = new JTextField();
        textFieldName.setText(staff.getFirstName());
        textFieldName.setMaximumSize(new Dimension(100,50));

        JLabel labelLastName = new JLabel("LastName");
        labelLastName.setSize(100,50);
        JTextField textFieldLastName = new JTextField();
        textFieldLastName.setText(staff.getLastName());
        textFieldLastName.setMaximumSize(new Dimension(100,50));

        JLabel labelPatronymic = new JLabel("Patronymic");
        labelPatronymic.setSize(100,50);
        JTextField textFieldPatronymic = new JTextField();
        textFieldPatronymic.setText(staff.getPatronymic());
        textFieldPatronymic.setMaximumSize(new Dimension(100,50));

        JLabel labelPosition= new JLabel("Position");
        labelPosition.setSize(100,50);
        JTextField textFieldPosition = new JTextField();
        textFieldPosition.setText(staff.getPosition());
        textFieldPosition.setMaximumSize(new Dimension(100,50));

        JLabel labelTelephoneNumber= new JLabel("Telephone number");
        labelTelephoneNumber.setSize(100,50);
        JTextField textFieldTelephoneNumber = new JTextField();
        textFieldTelephoneNumber.setText(staff.getTelephoneNumber());
        textFieldTelephoneNumber.setMaximumSize(new Dimension(100,50));

        JLabel labelBankDetails= new JLabel("Bank Details");
        labelBankDetails.setSize(100,50);
        JTextField textFieldBankDetails = new JTextField();
        textFieldBankDetails.setText(staff.getBankDetais());
        textFieldBankDetails.setMaximumSize(new Dimension(100,50));

        JLabel labelHours= new JLabel("Number worked hours");
        labelHours.setSize(100,50);
        JTextField textFieldHours = new JTextField();
        textFieldHours.setText(String.valueOf(staff.getNumberOfHoursWorked()));
        textFieldHours.setMaximumSize(new Dimension(100,50));


        JButton button = new JButton("Edit staff");
        button.setMaximumSize(new Dimension(100,50));

        button.addActionListener(actionEvent ->
        {
            jframe.dispose();
            if(textFieldName.getText().equals("") || textFieldLastName.getText().equals("") || textFieldPatronymic.getText().equals("") || textFieldPosition.getText().equals("") || textFieldTelephoneNumber.getText().equals("") || textFieldBankDetails.getText().equals("") || textFieldHours.getText().equals(""))
            {
                System.out.println("Ошибка");
            }
            else{

                shop.getServiceManagementEmployee().editStaff(staff,textFieldName.getText(),textFieldLastName.getText(),textFieldPatronymic.getText(),textFieldPosition.getText(),textFieldTelephoneNumber.getText(),textFieldBankDetails.getText(),Integer.parseInt(textFieldHours.getText()));
                showFrameManagementEmployee();
            }

        });

        jPanel.add(labelName);
        jPanel.add(textFieldName);
        jPanel.add(labelLastName);
        jPanel.add(textFieldLastName);
        jPanel.add(labelPatronymic);
        jPanel.add(textFieldPatronymic);
        jPanel.add(labelPosition);
        jPanel.add(textFieldPosition);
        jPanel.add(labelTelephoneNumber);
        jPanel.add(textFieldTelephoneNumber);
        jPanel.add(labelBankDetails);
        jPanel.add(textFieldBankDetails);
        jPanel.add(labelHours);
        jPanel.add(textFieldHours);
        jPanel.add(button);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }
}
