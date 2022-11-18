package com.bridgelabz.daythree;
import java.util.Scanner;
public class LargestElement {

	public static void main(String[] args) {
		int a[] = new int[5];
		int large;
		Scanner r = new Scanner (System.in);
		for(int i=0; i<5; i++) {
			a[i]=r.nextInt();
		}
		large=a[0];
		for(int i=1; i<5; i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println("largest element " +large);
	}

}
