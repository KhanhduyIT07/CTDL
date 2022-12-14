/**
 * EmployeeNode
 */
public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    public EmployeeNode() {

    }

    public EmployeeNode(Employee employee, EmployeeNode next, EmployeeNode previous) {
        this.employee = employee;
        this.next = next;
        this.previous = previous;
    }

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "EmployeeNode [employee=" + employee + "]";
    }

}