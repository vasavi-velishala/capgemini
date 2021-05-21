package com;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fact=1,n;
Scanner sc=new Scanner(System.in);
System.out.print("n:");
n=sc.nextInt();
while(n!=0)
{
	fact=fact*n;
	n--;
}
System.out.print(fact);
	}

}
