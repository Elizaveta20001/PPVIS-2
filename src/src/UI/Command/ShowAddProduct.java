package UI.Command;

public class ShowAddProduct implements CommandManagementProduct{
    private String name = "Show add product";

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
