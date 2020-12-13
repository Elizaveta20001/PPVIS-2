package View.Command;

public class EditProduct implements CommandManagementProduct {
    private String name = "Edit product";

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
