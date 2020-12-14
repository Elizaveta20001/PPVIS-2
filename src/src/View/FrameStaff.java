package View;

import View.Command.CommandStaff;

import java.util.ArrayList;

public class FrameStaff {
    private ArrayList<CommandStaff> commandStaffs = new ArrayList<>();

    public ArrayList<CommandStaff> getCommandStaffs() {
        return commandStaffs;
    }

    public void setCommandStaffs(ArrayList<CommandStaff> commandStaffs) {
        this.commandStaffs = commandStaffs;
    }
    public void buttonIsPressed(String name)
    {
        for(CommandStaff commandStaff:commandStaffs)
        {
            if(name.equals(commandStaff.getName()))
            {
                commandStaff.execute();
            }
        }
    }
}
