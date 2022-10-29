package com.Bridgelabz.Array;

public class Frequency_of_element {
	
	public static void main(String[] args) {
		
		int [] ar = {1, 2, 3, 2, 6, 4, 6, 2};
		
		int [] visitedArr = new int [ar.length];
		
		int visited = -1;
		
		for (int i = 0; i <ar.length; i++) {
			int count = 1;
			for (int j = i+1 ; j < visitedArr.length; j++) {
				if (ar[i] == ar[j]) {
					count++;
					visitedArr[j] = visited;
				}
			}
			
			if (visitedArr[i] != visited) {
				visitedArr[i] = count;	
			}
		}
		
		for (int i = 0; i < visitedArr.length; i++) {
			if (visitedArr[i] != visited) {
				System.out.println("Frequency of "+ ar[i] + " : " + visitedArr[i]);
			}
			
		}
		
	}

}
