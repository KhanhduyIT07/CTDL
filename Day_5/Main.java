
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        decToBin(30);
        System.out.println("");
    }

    public static void decToBin(int k) {
        MyStack myStack = new MyStack(20);
        System.out.println("Decimal " + k + "is converted to Binary system : ");
        while (k > 0) {
            myStack.push(new Integer(k % 2));
            k = k / 2;
        }
        while (!myStack.isEmpty()) {
            System.out.println("" + myStack.pop());

        }
        System.out.println("");
    }
}