package View;

import Controller.Shop;
import Controller.ShopImpl;
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
    public JFrame jframe;
    public void showLoginFrame()
    {
        jframe = new JFrame();
        jframe.setSize(1000,500);
        JPanel jpanel = new JPanel();
        jpanel.setLayout(new BoxLayout(jpanel,BoxLayout.LINE_AXIS));
        JLabel jlabel = new JLabel();
        jlabel.setText("Логин");
        JTextField jTextField = new JTextField();
        jTextField.setMaximumSize(new Dimension(400,50));
        JLabel jlabelPassword = new JLabel();
        jlabelPassword.setText("Пароль");
        JTextField jTextField1 = new JTextField();
        jTextField1.setMaximumSize(new Dimension(400,50));
        JButton jButton = new JButton();
        jButton.setMaximumSize(new Dimension(400,50));
        jButton.setText("Войти");
        jButton.addActionListener(actionEvent ->
        {
            login(jTextField.getText(),jTextField1.getText());
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
        shop.authentication(login, password);
        showMainFrame();
    }
    public void showMainFrame()
    {
        if(Role.administrator == shop.getCurrentStaff().getRole())
        {
            jframe.dispose();
            jframe.removeAll();
            jframe.setSize(1000,500);
            JPanel jpanel = new JPanel();
            jpanel.setLayout(new BoxLayout(jpanel,BoxLayout.Y_AXIS));
            jframe.setVisible(true);
        }
        else if(Role.manager == shop.getCurrentStaff().getRole())
        {

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
