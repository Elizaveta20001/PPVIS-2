package UI;

import Services.Shop;
import Services.ShopImpl;
import Model.Role;

import javax.swing.*;
import java.awt.*;

public class UI {
    private ShopImpl shop;
    private FrameStaff frameStaff;
    private FrameProduct frameProduct;
    private FrameManagementEmployee frameManagementEmployee;
    private FrameManagementProduct frameManagementProduct;
    private FrameShowNumber frameShowNumber;
    public void showLoginFrame()
    {
        JFrame jframe = new JFrame();
        jframe.setSize(1000,500);
        JPanel jpanel = new JPanel();
        jpanel.setLayout(new BoxLayout(jpanel,BoxLayout.LINE_AXIS));
        JLabel jlabel = new JLabel();
        jlabel.setText("Login");
        JTextField jTextField = new JTextField();
        jTextField.setMaximumSize(new Dimension(400,50));
        JLabel jlabelPassword = new JLabel();
        jlabelPassword.setText("Password");
        JTextField jTextField1 = new JTextField();
        jTextField1.setMaximumSize(new Dimension(400,50));
        JButton jButton = new JButton();
        jButton.setMaximumSize(new Dimension(400,50));
        jButton.setText("Log in");
        jButton.addActionListener(actionEvent ->
        {

            login(jTextField.getText(),jTextField1.getText());
            jframe.dispose();
        });
        jpanel.add(jlabel);
        jpanel.add(jTextField);
        jpanel.add(jlabelPassword);
        jpanel.add(jTextField1);
        jpanel.add(jButton);
        jframe.add(jpanel);
        jframe.setVisible(true);
    }
    public void login(String login, String password)
    {
        shop.authentication(login, password,shop.getServiceManagementEmployee().getStaffArrayList());
        showMainFrame();
    }
    public void showMainFrame()
    {
        if(Role.administrator == shop.getCurrentStaff().getRole())
        {
            JFrame frame = new JFrame();
            frame.setSize(1000,500);
            JPanel jpanel1 = new JPanel();
            jpanel1.setLayout(new BoxLayout(jpanel1,BoxLayout.X_AXIS));
            JButton buttonFrameManagmentEmployee = new JButton();
            buttonFrameManagmentEmployee.setText("Staff management");
            buttonFrameManagmentEmployee.setSize(400,50);
            buttonFrameManagmentEmployee.addActionListener(actionEvent ->
            {

                frameManagementEmployee.showFrameManagementEmployee();
            });
            JButton buttonShowInformation = new JButton();
            buttonShowInformation.setText("Show information");
            buttonShowInformation.setSize(400,50);
            buttonShowInformation.addActionListener(actionEvent -> {

                frameStaff.buttonIsPressed(buttonShowInformation.getText());
            });
            JButton buttonShowGetSalary = new JButton();
            buttonShowGetSalary.setText("Show frame get salary");
            buttonShowGetSalary.setSize(400,50);
            buttonShowGetSalary.addActionListener(actionEvent -> {
                frameStaff.buttonIsPressed(buttonShowGetSalary.getText());
            });


            jpanel1.add(buttonFrameManagmentEmployee);
            jpanel1.add(buttonShowInformation);
            jpanel1.add(buttonShowGetSalary);
            frame.add(jpanel1);
            frame.setVisible(true);

        }
        else if(Role.manager == shop.getCurrentStaff().getRole())
        {
            JFrame frame = new JFrame();
            frame.setSize(1000,500);
            JPanel jpanel1 = new JPanel();
            jpanel1.setLayout(new BoxLayout(jpanel1,BoxLayout.X_AXIS));
            JButton buttonFrameManagmentProduct= new JButton();
            buttonFrameManagmentProduct.setText("Show number of products");
            buttonFrameManagmentProduct.setSize(1000,50);
            buttonFrameManagmentProduct.addActionListener(actionEvent ->
            {

                frameShowNumber.showNumber();

            });
            JButton buttonShowOverdueProduct = new JButton();
            buttonShowOverdueProduct.setText("Show overdue products");
            buttonShowOverdueProduct.setSize(1000,50);
            buttonShowOverdueProduct.addActionListener(actionEvent -> {

                frameProduct.buttonIsPressed(buttonShowOverdueProduct.getText());
            });
            JButton buttonManagementProduct = new JButton();
            buttonManagementProduct.setText("Show management products");
            buttonManagementProduct.setSize(1000,50);
            buttonManagementProduct.addActionListener(actionEvent -> {
                frameManagementProduct.buttonIsPressed(buttonManagementProduct.getText());
            });


            jpanel1.add(buttonManagementProduct);
            jpanel1.add(buttonShowOverdueProduct);
            jpanel1.add(buttonFrameManagmentProduct);
            frame.add(jpanel1);
            frame.setVisible(true);

        }
    }

    public FrameManagementEmployee getFrameManagementEmployee() {
        return frameManagementEmployee;
    }

    public FrameProduct getFrameProduct() {
        return frameProduct;
    }

    public FrameManagementProduct getFrameManagementProduct() {
        return frameManagementProduct;
    }

    public FrameShowNumber getFrameShowNumber() {
        return frameShowNumber;
    }

    public void setFrameManagementEmployee(FrameManagementEmployee frameManagementEmployee) {
        this.frameManagementEmployee = frameManagementEmployee;
    }

    public void setFrameManagementProduct(FrameManagementProduct frameManagementProduct) {
        this.frameManagementProduct = frameManagementProduct;
    }

    public void setFrameProduct(FrameProduct frameProduct) {
        this.frameProduct = frameProduct;
    }

    public void setFrameShowNumber(FrameShowNumber frameShowNumber) {
        this.frameShowNumber = frameShowNumber;
    }

    public FrameStaff getFrameStaff() {
        return frameStaff;
    }

    public void setFrameStaff(FrameStaff frameStaff) {
        this.frameStaff = frameStaff;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(ShopImpl shop) {
        this.shop = shop;
    }
}
