package day2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int number=sc.nextInt();
		if(number>=0)
		{
			int fac=1;
			for(int i=number;i>=1;i--)
				fac=fac*i;
			System.out.println("Factorial of a "+number+" is "+fac );
		}
		sc.close();
	}}