public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Employee employee01 = new Employee("A", "Nguyen", 111);
        // EmployeeNode employeeNode01 = new EmployeeNode(employee01);
        // Employee employee02 = new Employee("B", "Nguyen", 222);
        // EmployeeNode employeeNode02 = new EmployeeNode(employee02);
        // Employee employee03 = new Employee("C", "Nguyen", 333);
        // EmployeeNode employeeNode03 = new EmployeeNode(employee03);
        // employeeNode02.setPrevious(employeeNode01);
        // employeeNode02.setNext(employeeNode03);

        // System.out.println("" + employeeNode01);
        // System.out.println("" + employeeNode02);
        // System.out.println("" + employeeNode03);
        Employee employee01 = new Employee("A", "Nguyen", 111);
        Employee employee02 = new Employee("B", "Nguyen", 222);
        Employee employee03 = new Employee("C", "Nguyen", 333);
        Employee employee04 = new Employee("D", "Nguyen", 444);
        Employee employee05 = new Employee("E", "Nguyen", 555);
        EmployeeDoublyLinkedList doublyLinkedList = new EmployeeDoublyLinkedList();
        doublyLinkedList.addToFront(employee01);
        doublyLinkedList.addToFront(employee02);
        doublyLinkedList.addToFront(employee03);
        doublyLinkedList.addToFront(employee04);
        doublyLinkedList.addToFront(employee05);
        // new employeee
        doublyLinkedList.removeFormFront();
        doublyLinkedList.printList();
        System.out.println(" " + doublyLinkedList.getSize());
        // noew employee05 is in the front
        doublyLinkedList.removeFormFront();
        doublyLinkedList.printList();
        System.out.println("" + doublyLinkedList.getSize());
        Employee billEnd = new Employee("Bill", "End", 666);
        doublyLinkedList.addToEnd(billEnd);
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());
        doublyLinkedList.removeFormFront();
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());
        doublyLinkedList.removeFromEnd();
        doublyLinkedList.printList();
        System.out.println(doublyLinkedList.getSize());

    }
}
