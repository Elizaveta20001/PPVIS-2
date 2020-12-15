package UI.Command;

public class ShowSellProduct implements CommandManagementProduct {
    private String name = "Show sell product";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        //ЛИШНИЙ
    }
}
