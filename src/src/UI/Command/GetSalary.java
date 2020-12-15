package UI.Command;

public class GetSalary implements CommandStaff {
    private String name = "Get Salary";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        //лишний
    }
}
