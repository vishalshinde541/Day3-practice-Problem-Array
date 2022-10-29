package com.Bridgelabz.Array;

public class Elements_On_Even_And_Odd_Position {
	public static void main(String[] args) {

		int[] ar = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		System.out.println("Elements of given array present on even position: ");

		for (int i = 1; i < ar.length; i = i + 2) {
			System.out.println(ar[i]);
		}

		System.out.println("--------------------");

		System.out.println("Elements of given array present on odd position: ");

		for (int i = 0; i < ar.length; i = i + 2) {
			System.out.println(ar[i]);
		}
	}

}
