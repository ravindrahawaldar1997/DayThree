package com.bridgelabz.daythree;
import java.util.Scanner;
public class ReverseAraay {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Eneter the size of array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0; i<a.length; i++ ) {
			a[i]=sc.nextInt();
		}
		System.out.println("Reversed array is");
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
	}

}
