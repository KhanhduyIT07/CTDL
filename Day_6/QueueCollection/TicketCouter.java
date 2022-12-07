package QueueCollection;

import java.util.LinkedList;
import java.util.Queue;

public class TicketCouter {
     final static int process = 120;
     final static int MAX_CASHIERS = 10;
     final static int NUM_CUSTOMER = 100;

     public static void main(String[] args) {

          Customer customer;
          Queue<Customer> customerQueue = new LinkedList<Customer>();
          int[] cashierTime = new int[MAX_CASHIERS];
          int totalTime, averageTime, departs;

          for (int cashiers = 0; cashiers < MAX_CASHIERS; cashiers++) {
               for (int count = 0; count < cashiers; count++) {
                    cashierTime[count] = 0;
               }
               for (int count = 1; count <= NUM_CUSTOMER; count++) {
                    customerQueue.add(new Customer(count * 15));
               }
               totalTime = 0;
               while (!(customerQueue.isEmpty())) {
                    for (int count = 0; count <= cashiers; count++) {
                         if (!(customerQueue.isEmpty())) {
                              customer = customerQueue.poll();
                              if (customer.getArrivalTime() > cashierTime[count]) {
                                   departs = customer.getArrivalTime() + process;
                              } else {
                                   departs = cashierTime[count] + process;
                              }
                              customer.setDepartureTime(departs);
                              cashierTime[count] = departs;
                              totalTime += customer.totalTime();
                         }
                    }
               }

               averageTime = totalTime / NUM_CUSTOMER;
               System.out.println("Number of cashiers: " + (cashiers + 1));
               // thời gian trung bình
               System.out.println("Average time: " + averageTime + "\n");
          }
     }
}
