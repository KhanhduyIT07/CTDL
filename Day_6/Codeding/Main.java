package Codeding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          Queue myQueue = new LinkedList();
          String testString = "";
          System.out.println(" enter string check ");
          String inputString = sc.nextLine();
          for (int i = inputString.length() - 1; i >= 0; i--) {
               myQueue.add(inputString.charAt(i));
          }
          System.out.println("" + myQueue);
          // in ra kết quả đã tách ra và đảo ngược
          while (!myQueue.isEmpty()) {
               testString = testString + myQueue.remove();
          }
          // so sánh
          if (inputString.equals(testString)) {
               System.out.println(inputString + " This is a palindrom");
          } else {
               System.out.println(inputString + " This is not palindrom");
          }
     }
}
