package com.acts;

import java.util.Scanner;

public class LargerOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Nos :");
		
		System.out.println("Enter No1:");
		int a = sc.nextInt();
		
		System.out.println("Enter No2:");
		int b = sc.nextInt();
		
		if(a>b) {
			
			System.out.println("greater number is: "+a);
			
		}else {
			System.out.println("greater number is: "+b);
			
		}
	}

}
