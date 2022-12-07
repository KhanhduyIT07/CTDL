
public class EmployeeNode {
    private Employee Push;
    private EmployeeNode next;

    public EmployeeNode() {
    }

    public EmployeeNode(Employee Push) {
        this.Push = Push;
    }

    public EmployeeNode(Employee Push, EmployeeNode next) {
        this.Push = Push;
        this.next = next;
    }

    public Employee getEmployee() {
        return Push;
    }

    public void setEmployee(Employee Push) {
        this.Push = Push;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "EmployeeNode [Push=" + Push + "]";
    }
}