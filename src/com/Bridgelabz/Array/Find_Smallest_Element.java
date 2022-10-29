package com.Bridgelabz.Array;

public class Find_Smallest_Element {
	
	public static void main(String[] args) {

		int[] arr = new int[] { 17, 25, 31, 28, 12, 75, 80 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Smallest element present in array: " + min);
	}


}
