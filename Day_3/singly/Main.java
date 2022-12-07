package singly;

public class Main {
    public static void main(String[] args) {
        Employee e01 = new Employee(01, "A", "Linh");
        Employee e02 = new Employee(02, "B", "Duy");
        Employee e03 = new Employee(03, "C", "Phuc");
        Employee e04 = new Employee(04, "D", "Ngoc");
        Employee e05 = new Employee(05, "E", "Toan");
        Employee e06 = new Employee(06, "F", "Luan");
        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println("" + list.dangTrong());
        list.addFirst(e01);
        list.addFirst(e02);
        list.addFirst(e03);
        list.addFirst(e04);
        list.addFirst(e05);
        list.addFirst(e06);
        System.out.println(" " + list.getSize());
        list.printList();
    }
}