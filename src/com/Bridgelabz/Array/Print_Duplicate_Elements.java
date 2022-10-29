package com.Bridgelabz.Array;

public class Print_Duplicate_Elements {

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3, 2, 6, 4, 4, 6};
		
		System.out.println("Duplicate elements of give array :");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
			
		}
	}
}
