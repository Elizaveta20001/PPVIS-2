package Model;

public class Staff {
    private String id;
    private String login;
    private String password;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String position;
    private String telephoneNumber;
    private String bankDetais;
    private int numberOfHoursWorked;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public String getBankDetais() {
        return bankDetais;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPosition() {
        return position;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setBankDetais(String bankDetais) {
        this.bankDetais = bankDetais;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
