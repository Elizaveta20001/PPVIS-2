package UI.Command;

public class ShowInformation implements CommandStaff{
    private String name = "Show information";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute() {

    }
}
