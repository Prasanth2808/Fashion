package com.java;

public class pattern {

	public static void main(String[] args) {

		int row=5;
		int column=5;
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
				System.out.println(" ");
		}
		
		for(int w=row-1; w>=1; w-- ) {
			
			for(int x=1; x<=w; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

