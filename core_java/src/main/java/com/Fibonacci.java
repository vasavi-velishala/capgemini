package com;

import java.util.Scanner;

public class Fibonacci {
	static int n;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n:");
		n=sc.nextInt();
		int f0,f1,f2;
		f0=0;
		f1=1;
		f2=f0+f1;
		System.out.println(f0);
		System.out.println(f1);
		while(f2<=n)
		{
			System.out.println(f2);
			f0=f1;
			f1=f2;
			f2=f1+f2;
			
		}
	}

}
