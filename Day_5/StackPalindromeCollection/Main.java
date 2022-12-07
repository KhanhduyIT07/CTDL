
package StackPalindromeCollection;

import java.util.Scanner;
import java.util.Stack;

public class Main {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String input = null;
          System.out.print("Enter for check: ");
          input = sc.nextLine();
          // dung collection
          Stack<Character> myStack = new Stack<>();
          // Tách từng kí tự ra và cho và my stack
          for (int i = 0; i < input.length(); i++) {
               myStack.push(input.charAt(i));
               // đảo ngược vẫn chính là nó ví dụ mom
          }
          // lấy xâu theo chiều ngược lại
          String reverInput = "";
          while (!myStack.isEmpty()) {
               reverInput = reverInput + myStack.pop();
               // lấy phần tử ra
          }
          if (input.equals(reverInput)) {
               System.out.println(input + ":" + " is palindrome");
          } else {
               System.out.println(input + ":" + " is not palindrome");
          }

     }

}