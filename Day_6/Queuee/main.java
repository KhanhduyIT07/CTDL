package Queuee;

public class main {
     public static void main(String[] args) {
          Employee empStart = new Employee("Start", "Phan", 123);
          Employee emp02 = new Employee("A", "Thanh", 234);
          Employee emp03 = new Employee("B", "Khanh", 345);
          Employee emp04 = new Employee("C", "Duy", 456);
          Employee emp05 = new Employee("D", "Van", 567);
          Employee empEnd = new Employee("End", "Nguyen", 678);

          ArrayQueue arrayQueue = new ArrayQueue(10);
          arrayQueue.addToBack(empStart);
          arrayQueue.addToBack(emp02);
          arrayQueue.addToBack(emp03);
          arrayQueue.addToBack(emp04);
          arrayQueue.addToBack(emp05);
          arrayQueue.addToBack(empEnd);
          arrayQueue.printMyQueue();
          System.out.println("" + arrayQueue.getBack());
          System.out.println("" + arrayQueue.getFront());
          System.out.println("peek: " + arrayQueue.peekFromFront());
          System.out.println("remove: " + arrayQueue.removeFrom());
          System.out.println("" + arrayQueue.getBack());
          System.out.println("" + arrayQueue.getFront());
          arrayQueue.printMyQueue();

     }
}
