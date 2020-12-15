package UI.Command;

public class ShowSendProductToShoppingRoom implements CommandManagementProduct{
    private String name = "Show send product to shopping room";

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
