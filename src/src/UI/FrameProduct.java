package UI;

import UI.Command.CommandProducts;

import java.util.ArrayList;

public class FrameProduct {
    private ArrayList<CommandProducts> commandProducts = new ArrayList<>();

    public ArrayList<CommandProducts> getCommandProducts() {
        return commandProducts;
    }

    public void setCommandStaffs(ArrayList<CommandProducts> commandProducts) {
        this.commandProducts = commandProducts;
    }
    public void buttonIsPressed(String name)
    {
        for(CommandProducts commandProducts1:commandProducts)
        {
            if(commandProducts1.getName().equals(name))
            {
                commandProducts1.execute();
            }
        }
    }
}
