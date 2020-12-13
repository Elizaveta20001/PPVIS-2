package View.Command;

public class GetProduct implements CommandManagementProduct {
    private String name ="Get product";

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
