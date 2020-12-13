package UI.Command;

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

    }
}
