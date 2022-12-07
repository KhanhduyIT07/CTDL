package StackEmployeeeee;

import java.util.EmptyStackException;

public class ArrayStack {
     // khai báo mãng chứa Stack
     private Employee[] myStack;
     // dùn top để chốt các phần tử tự add
     private int top;

     // Ham dưng để xin cấp phát
     public ArrayStack(int capacity) {
          myStack = new Employee[capacity];
     }

     // thêm 1 phần tử vào stacks
     public void push(Employee employee) {
          // kiễm tra stack có ful không
          if (top == myStack.length) {
               Employee[] newArray = new Employee[2 * myStack.length];
               System.arraycopy(myStack, 0, newArray, 0, myStack.length);
               myStack = newArray;
          }
          //
          myStack[top] = employee;
          top++;
     }

     // Hàm xoá
     public Employee pop() {
          // nếu rõng thì không có để xoá
          if (isEmpty()) {
               throw new EmptyStackException();
          }
          // lấy phần tử trên cùng , đã thay thêm 1 biến
          Employee employee = myStack[--top];
          myStack[top] = null;
          return employee;
     }

     // hàm peek lấy phần tử trên top để coi thôi
     public Employee peek() {
          if (isEmpty()) {
               throw new EmptyStackException();
          }
          return myStack[top - 1];
     }

     public int size() {
          return top;
     }

     public boolean isEmpty() {
          return top == 0;
     }

     public void printStack() {
          for (int i = 0; i < top; i++) {
               System.out.println(myStack[i] + "");
          }
     }
}
