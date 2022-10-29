package com.Bridgelabz.Array;

public class Sort_Array_Ascending {
	public static void main(String[] args) {

		int[] arr = new int[] { 6, 2, 5, 1, 9 };
		int temp = 0;

		System.out.println("Original array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

		System.out.println("Array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
