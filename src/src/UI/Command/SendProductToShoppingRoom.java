package UI.Command;

import javax.swing.*;
import java.awt.*;

public class SendProductToShoppingRoom implements CommandManagementProduct {
    private String name = "Send product to shopping room";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        JFrame jframe = new JFrame();
        jframe.setSize(1000,1000);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.Y_AXIS));
        JComboBox<String> productComboBox= new JComboBox<>();
        productComboBox.setMaximumSize(new Dimension(100,50));

        JLabel labelNumber = new JLabel("Number");
        labelNumber.setSize(100,50);

        JTextField textFieldNumber = new JTextField();
        textFieldNumber.setSize(100,50);


        JButton button = new JButton();
        button.setSize(100,50);
        button.addActionListener(actionEvent ->
        {
            //
        });
        jPanel.add(productComboBox);
        jPanel.add(labelNumber);
        jPanel.add(textFieldNumber);
        jPanel.add(button);
        jframe.add(jPanel);
        jframe.setVisible(true);
    }
}
