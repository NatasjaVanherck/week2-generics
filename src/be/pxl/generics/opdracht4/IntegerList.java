package be.pxl.generics.opdracht4;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerList{

	private static ArrayList<Integer> integerList = new ArrayList<>();
	
	public static void maakIntegerLijst(int getal){
		for(int i = 0; i < 10; i++){
			integerList.add(getal);
		}
	}
	
	public static void printIntegerLijst(){
		for(int i = 0; i < integerList.size(); i++){
			System.out.println(integerList.get(i).toString());
		}
	}
	
	public static <T> ArrayList<T> maakLijst(T iets){
		ArrayList<T> anyList = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			anyList.add(iets);
		}
		return anyList;
	}
	
	public static <T> void printLijst(ArrayList<T> anyList){
		for(int i = 0; i < anyList.size(); i++){
			System.out.println(anyList.get(i));
		}
	}
	
	public static <T> void swapList(ArrayList<T> anyList){
		Collections.reverse(anyList);
	}
	
	public static <T extends Comparable<T>> void sortList(ArrayList<T> anyList){
		//Collections.sort(anyList);
		
		int i,j;
		int n = anyList.size();
		
		for (j = 0; j < n-1; j++) 
		  {
		    int iMin = j;
		    for (i = j+1; i < n; i++) {
		        if (anyList.get(i).compareTo(anyList.get(iMin)) < 0) {
		            iMin = i;
		        }
		    }
		    if(iMin != j) 
		    {
		    	T temp1 = anyList.get(j);
		    	T temp2 = anyList.get(iMin);
		    	anyList.set(j, temp2);
		    	anyList.set(iMin, temp1);
		    	
		    }
		}
	}
}
