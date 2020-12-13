package UI.Command;

public class ShowOverdueProducts implements CommandProducts{
    private String name = "Show overdue products";

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
