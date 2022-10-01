package com.Bridgelabz.Array;

public class Day3ArrayExample {
	
	public static void main(String[] args) {
        int [] ar=new int[5];
		
		ar[0] = 20;
		ar[1] = 15;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;
		
		System.out.println("---Print single element of an array---");
		System.out.println(ar[1]);    
		
		System.out.println("---print all elements in an array---");
		
		
		for (int i = 0; i <= ar.length-1; i++) 
		{
			System.out.println(ar[i]);    
		}
		
	}

}
