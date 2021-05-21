package com;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int i,n,count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("n:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(i/n==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.print("prime");
		}
		else
		{
			System.out.print("not prime");
		}
	}
}
