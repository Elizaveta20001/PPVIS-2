package View.Command;

public class ShowEditProduct implements CommandManagementProduct {
    private String name = "Show edit product";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        //лишний
    }
}
