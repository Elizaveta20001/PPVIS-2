package View.Command;

public class OrderProduct implements CommandManagementProduct {
    private String name = "Order product";

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
