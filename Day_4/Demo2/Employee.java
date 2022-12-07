
public class Employee {
    private String firstName;
    private String LastName;
    private int id;

    public Employee() {

    }

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", LastName=" + LastName + ", id=" + id + "]";
    }

}
