package com.Bridgelabz.Array;

public class Find_Largest_Element {

	public static void main(String[] args) {

		int[] arr = new int[] { 12, 17, 25, 31, 28, 75, 80 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest element present in array: " + max);
	}

}
