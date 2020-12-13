package UI.Command;

public class ShowOrderProduct implements CommandManagementProduct {
    private String name="Show order product";

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
