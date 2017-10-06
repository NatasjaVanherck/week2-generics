package be.pxl.generics.opdracht4;

import java.util.ArrayList;

public class IntegerListApp {

	public static void main(String[] args) {
		IntegerList.maakIntegerLijst(27);
		IntegerList.printIntegerLijst();
		
		ArrayList<Double> list = IntegerList.maakLijst(2.5);
		IntegerList.printLijst(list);
		
		list.set(3, 8.5);
		list.set(5, 5.5);
			
		System.out.println("UnSorted list");
		IntegerList.printLijst(list);
		System.out.println("Sorted list");
		IntegerList.sortList(list);
		IntegerList.printLijst(list);
		
		
	}

}
