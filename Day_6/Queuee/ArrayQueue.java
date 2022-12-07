package Queuee;

import java.util.NoSuchElementException;

public class ArrayQueue {

     private Employee[] myQueue;
     private int front = 0;
     private int back = 0;

     public ArrayQueue() {
     }

     public ArrayQueue(int capacity) {
          myQueue = new Employee[capacity];
     }

     public void addToBack(Employee employee) {
          if (back == myQueue.length) {

               Employee[] newArray = new Employee[2 * myQueue.length];
               // coppy phan tu
               System.arraycopy(myQueue, 0, newArray, 0, myQueue.length);

          }
          // đây là thêm vào mãng mới
          myQueue[back] = employee;
          back++;
     }

     // xoá
     public Employee removeFrom() { // FromFont
          if (size() == 0) {
               throw new NoSuchElementException();
          }

          Employee removedEmployee = myQueue[front];

          myQueue[front] = null;

          front++;

          if (size() == 0) {
               front = 0;
               back = 0;
          }

          return removedEmployee;
     }

     public Employee peekFromFront() {
          if (size() == 0) {
               throw new NoSuchElementException();
          }
          return myQueue[front];
     }

     // in
     public void printMyQueue() {
          for (int i = front; i < back; i++) {
               System.out.println("" + myQueue[i]);

          }
     }

     public int getFront() {
          return front;
     }

     public void setFront(int front) {
          this.front = front;
     }

     public int getBack() {
          return back;
     }

     public void setBack(int back) {
          this.back = back;
     }

     // size
     public int size() {
          return back - front;
     }
}