package QueueCollectionPalindromee;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Queue myQueue = new LinkedList();
        String testString = "";
        System.out.println(" enter string check ");
        String inputString = in.nextLine();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            // tách
            myQueue.add(inputString.charAt(i));
        }
        System.out.println("" + myQueue);

        while (!myQueue.isEmpty()) {
            testString = testString + myQueue.remove();
        }

        if (inputString.equals(testString)) {
            System.out.println(inputString + " This is a palindrom");
        } else {
            System.out.println(inputString + " This is not palindrom");
        }

    }

}