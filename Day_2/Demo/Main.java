import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choncase;
        StudentList studentList = new StudentList();
        while (true) {
            choncase= menu.userChoice();
            switch (choncase) {
                case 1:
                    studentList.create();

                    break;
                case 2:
                    studentList.display();
                    break;
                case 3:
                    studentList.remove();
                    break;
                case 4:
                    studentList.update();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Chon khong hop");
            }
        }

    }
}
