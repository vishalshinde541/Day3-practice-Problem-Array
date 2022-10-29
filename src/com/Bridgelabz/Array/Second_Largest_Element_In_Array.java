package com.Bridgelabz.Array;

public class Second_Largest_Element_In_Array {
	public static void main(String[] args) {
		
		int[] arr = new int[] { 6, 2, 5, 1, 9 };
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		System.out.println("Second largest element of given array is : "+arr[arr.length-2]);
	}

}
