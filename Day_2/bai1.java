

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class  bai1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int index;
		ArrayList<Integer> myList= new ArrayList<>();
		// Them phan tu vao 
		myList.add(33);
		myList.add(49);
		myList.add(28);
		myList.add(29);
        myList.add(90);
        myList.add(100);
		for (int i = 0; i < myList.size(); i++) {
			System.out.println("myList = "+myList.get(i));
		}
		System.out.println();
		// Thay doi 
		System.out.println("Nhap vi tri muon thay doi = ");
		index=input.nextInt();
		System.out.println("Nhap so moi: ");
		int newValue=input.nextInt();
		if (index<myList.size()) {
			myList.set(index, newValue);
		} else {
			System.out.println("So o ngoai");
		}
		System.out.println("Sau update: ");
		for (int i = 0; i < myList.size(); i++) {
			System.out.println("myList = "+myList.get(i));
		}
		System.out.println();
		
		// Xoa 1 phan tu
		System.out.println("Nhap so de xoa = ");
		index=input.nextInt();
		if (index<myList.size()) {
			myList.remove(index);
		} else {
			System.out.println("Index is out of boundary");
		}
		
		System.out.println("after delete: ");// 
				for (int i = 0; i < myList.size(); i++) {
					System.out.println("myList = "+myList.get(i));
				}
				System.out.println();
				
	   // In 1 phan tu ra coi
				System.out.println("so o vi tri thu  2: "+ myList.get(2));
	}
}