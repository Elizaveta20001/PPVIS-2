package View.Command;

public class SellProduct implements CommandManagementProduct {
    private String name="Sell product";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {

    }
}
