package question1;

import java.util.ArrayList;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// Create two sample array lists with some common elements
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		int[] data1 = { 10, 20, 30, 40, 50 };
		int[] data2 = { 10, 30, 50, 70, 80 };
		
		for (int i = 0; i < data1.length; i++)
			a1.add(data1[i]);
		for (int i = 0; i < data2.length; i++)
			a2.add(data2[i]);
		
		System.out.println("a1 is " + a1);
		System.out.println("a2 is " + a2);
		ArrayList<Integer> removed = removeDuplicates(a1, a2); // Remove the common elements
		System.out.println("Removed elements: " + removed);
		System.out.println("a1 is now " + a1);
		System.out.println("a2 is now " + a2);
		}// main
	
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> a1, ArrayList<Integer> a2) {
		int a1Size = a1.size();
		int a2Size = a2.size();
		ArrayList<Integer> removed = new ArrayList<Integer>();
		
		//  One tiny step under excellent code :) hehexd O(n^2)
	for(int i=0; i<a1Size;i++) {
		for (int j = 0; j < a2Size; j++) {	//These for-loops iterate thru all possible matches
			if(a1.get(i) == a2.get(j)) {	//if the integers match...
				removed.add(a1.get(i));		//... add to the removed list
			}
		}		
	}
		a1.removeAll(removed);			// remove anything in the original two arrays that
		a2.removeAll(removed);			// are in the removed list
	return removed; 
		
	}

}


