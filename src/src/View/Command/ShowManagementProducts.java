package View.Command;

public class ShowManagementProducts implements CommandManagementProduct {
    private String name = "Show management products";

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
