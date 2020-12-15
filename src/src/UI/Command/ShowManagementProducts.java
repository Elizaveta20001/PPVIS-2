package UI.Command;

import javax.swing.*;

public class ShowManagementProducts implements CommandManagementProduct {
    private String name = "Show management products";

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
        JButton jButtonAddProduct = new JButton();
        jButtonAddProduct.setText("Add product");
        jButtonAddProduct.setSize(400,50);
        jButtonAddProduct.addActionListener(actionEvent ->
        {
            //
        });
        JButton jButtonDeleteProduct = new JButton();
        jButtonDeleteProduct.setText("Sell product");
        jButtonDeleteProduct.setSize(400,50);
        jButtonDeleteProduct.addActionListener(actionEvent ->
        {
            //
        });
        JButton jButtonEditProduct = new JButton();
        jButtonEditProduct.setText("Edit product");
        jButtonEditProduct.setSize(400,50);
        jButtonEditProduct.addActionListener(actionEvent ->
        {
            //
        });
        JButton jButtonSendProduct= new JButton();
        jButtonSendProduct.setText("Send product to shopping room");
        jButtonSendProduct.setSize(400,50);
        jButtonSendProduct.addActionListener(actionEvent ->
        {
            //
        });

        JButton jButtonGetProduct= new JButton();
        jButtonGetProduct.setText("Get product");
        jButtonGetProduct.setSize(400,50);
        jButtonGetProduct.addActionListener(actionEvent ->
        {
            //
        });
        JButton jButtonOrderProduct= new JButton();
        jButtonOrderProduct.setText("Order product");
        jButtonOrderProduct.setSize(400,50);
        jButtonOrderProduct.addActionListener(actionEvent ->
        {
            //
        });
        jpanel1.add(jButtonAddProduct);
        jpanel1.add(jButtonDeleteProduct);
        jpanel1.add(jButtonEditProduct);
        jpanel1.add(jButtonGetProduct);
        jpanel1.add(jButtonOrderProduct);
        jpanel1.add(jButtonSendProduct);
        frame.add(jpanel1);
        frame.setVisible(true);
    }
}
