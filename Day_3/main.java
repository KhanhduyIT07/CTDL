import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * main VIDEO
 */
public class main {

    public static void main(String[] args) {
        LinkedList<String> placesToViSit = new LinkedList<>();

        placesToViSit.add("Quang Nam");
        placesToViSit.add("Quang Tri");
        placesToViSit.add("Quang Binh");
        placesToViSit.add(2, "Nghe An");
        placesToViSit.addFirst("DA Nang");
        placesToViSit.addLast("Hue");
        placesToViSit.remove("Nghe An");
        System.out.println("" + placesToViSit);
        System.out.println("==================");
        printLinkList(placesToViSit);
        System.out.println("After add the new city");
        // addNewAirport(placesToViSit, "newCity");

    }

    private static void printLinkList(LinkedList<String> myPlacesToViSit) {
        Iterator<String> iterator = myPlacesToViSit.iterator();
        while (iterator.hasNext()) {
            System.out.println("Now visting the : " + iterator.next());
        }
        System.out.println("=================");

    }

    // private static boolean addNewAirport(LinkedList<String> myplacesToViSit,
    // String string) {
    // ListIterator<String> ListIterator = myplacesToViSit.listIterator();

    // String newCity;
    // while (ListIterator.hasNext()) {
    // int comparisionValue = ListIterator.next().compareTo(newCity);
    // if (comparisionValue == 0) {
    // System.out.println(" This is now city already in the list ");
    // return false;
    // } else if (comparisionValue > 0) {
    // ListIterator.previous();
    // ListIterator.add(newCity);
    // return true;
    // }
    // }
    // ListIterator.add(newCity);
    // return true;
    // }
}