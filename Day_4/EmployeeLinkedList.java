
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
        // kích thước
        size++;
    }

    public void addToTail(Employee e) {
        // em co e , tạo ra new node
        EmployeeNode newNode = new EmployeeNode(e);
        EmployeeNode current = head;
        EmployeeNode tail = null;
        // neu list chưa co Node
        // mode moi them chinh la head
        if (isEmpty()) {
            head = newNode;
        } else {
            // co Node
            // dung 1 vong de di bo den cuoi hang
            while (current != null) {
                // chot phan tu truoc null
                tail = current;
                current = current.getNext();
            }
            // tai chinh a D
            tail.setNext(newNode);
            tail = newNode;
            // new node trở thành tail
        }
    }

    // cái remove dầu
    public EmployeeNode removeFromFront() {
        // list bi empty=> khong co node de remove
        if (isEmpty()) {
            return null;
        }
        // ay node dau tien , no rang node no chuan bi remove
        EmployeeNode removeNode = head;
        // chỉ lấy người kế nhiệmh của head.next
        head = head.getNext();
        // giảm kich thuoc
        removeNode.setEmployee(null);
        return removeNode;
    }

    // xoá phần tử ở cuối
    public EmployeeNode deleteFromTail() {
        EmployeeNode current = head;
        EmployeeNode nodeBeforeTail = null;
        // check
        if (isEmpty()) {
            return null;
        } else if (head.getNext() == null) {// Chua 1node
            head = null;// remove head
        } else {
            // di bo den phan tu cuoi cùng
            while (current != null) {
                nodeBeforeTail = current;
                current = current.getNext();
            }
            nodeBeforeTail.setNext(null);
            // nhay qua phan tu cuoi cung
        }
        return current;
    }

    private boolean isEmpty() {
        return false;
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

    public boolean Emsty() {
        return head == null;
    }

    // lấy ralisst
    public int getSize() {
        return size;
    }

    public String dangTrong() {
        return null;
    }

}
