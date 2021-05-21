package com;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n,r,sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("n:");
n=sc.nextInt();
while(n!=0)
{
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
}
System.out.print(sum);
	}

}
