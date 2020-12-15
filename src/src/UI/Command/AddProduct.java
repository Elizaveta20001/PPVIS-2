package UI.Command;

import javax.swing.*;

public class AddProduct implements CommandManagementProduct {
    private String name = "Add product";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        JFrame frame = new JFrame();
        frame.setSize(1000,500);
        JPanel jpanel1 = new JPanel();
        jpanel1.setLayout(new BoxLayout(jpanel1,BoxLayout.X_AXIS));

        JLabel labelName = new JLabel("Name");
        labelName.setSize(100,50);
        JTextField jTextFieldName = new JTextField();
        jTextFieldName.setSize(100,50);

        JLabel labelNumber = new JLabel("Number of products");
        labelNumber.setSize(100,50);
        JTextField jTextFieldNumber = new JTextField();
        jTextFieldNumber.setSize(100,50);

        JLabel labelUnitCost = new JLabel("Unit cost");
        labelUnitCost.setSize(100,50);
        JTextField jTextFieldUnitCost = new JTextField();
        jTextFieldUnitCost.setSize(100,50);

        JLabel labelSellPrice = new JLabel("Sell price");
        labelSellPrice.setSize(100,50);
        JTextField jTextFieldSellPrice = new JTextField();
        jTextFieldSellPrice.setSize(100,50);

        JLabel labelProvider= new JLabel("Provider");
        labelProvider.setSize(100,50);
        JTextField jTextFieldProvider = new JTextField();
        jTextFieldProvider.setSize(100,50);

        JLabel labelDate= new JLabel("Date");
        labelDate.setSize(100,50);
        JTextField jTextFieldDate = new JTextField();
        jTextFieldDate.setSize(100,50);

        JLabel labelType= new JLabel("Type");
        labelType.setSize(100,50);
        JTextField jTextFieldType = new JTextField();
        jTextFieldType.setSize(100,50);

        JButton jButton = new JButton();
        jButton.setSize(100,50);
        jButton.addActionListener(actionEvent ->
        {
            /////
        });
        jpanel1.add(labelName);
        jpanel1.add(jTextFieldName);
        jpanel1.add(labelNumber);
        jpanel1.add(jTextFieldNumber);
        jpanel1.add(labelUnitCost);
        jpanel1.add(jTextFieldUnitCost);
        jpanel1.add(labelSellPrice);
        jpanel1.add(jTextFieldSellPrice);
        jpanel1.add(labelProvider);
        jpanel1.add(jTextFieldProvider);
        jpanel1.add(labelDate);
        jpanel1.add(jTextFieldDate);
        jpanel1.add(labelType);
        jpanel1.add(jTextFieldType);
        jpanel1.add(jButton);
        frame.add(jpanel1);
        frame.setVisible(true);
    }
}
