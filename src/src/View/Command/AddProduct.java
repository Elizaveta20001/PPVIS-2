package View.Command;

public class AddProduct implements CommandManagementProduct {
    private String name = "Add product";

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
