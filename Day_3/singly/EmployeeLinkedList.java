package singly;

public class EmployeeLinkedList {
    private EmployeeNode head = null;
    private int size = 0;

    public EmployeeLinkedList() {
    }

    public void addFirst(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        // tạo mới
        newNode.setNext(head);
        head = newNode;
        // kíc thước
        size++;
    }

    public void printList() {
        EmployeeNode hienTai = head;
        while (hienTai != null) {
            System.out.println("" + hienTai.toString());
            System.out.println(" -> ");
            hienTai = hienTai.getNext();
        }
        System.out.println("Null");
    }

    public boolean dangTrong() {
        return head == null;
    }

    // lấy ralisst
    public int getSize() {
        return size;
    }

}
