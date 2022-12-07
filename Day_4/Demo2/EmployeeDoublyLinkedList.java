import java.util.concurrent.Flow.Publisher;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public EmployeeDoublyLinkedList() {

    }

    // add a node to fornt ò douly link list
    public void addToFront(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        newNode.setNext(head);
        if (head == null) {
            tail = newNode;
        } else {
            // here the head det
            head.setPrevious(newNode);
        }

        head = newNode;
        size++;
    }

    // ADD A NODE TO THE TAIL OF THE LIST
    public void addToEnd(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        if (tail == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
        size++;
    }

    public EmployeeNode removeFormFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
            // here go banck
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public void printList() {
        // here start with the entry point head
        EmployeeNode current = head;
        System.out.println("HEAD ->");
        while (current != null) {
            System.out.println(current);
            System.out.println(" <=");
            current = current.getNext();
        }
        System.out.println("Null");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void removeFromEnd() {
    }
}
