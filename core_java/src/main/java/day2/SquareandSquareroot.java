package day2;

import java.util.Scanner;

public class SquareandSquareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Caluculation of Square and Square root");
		System.out.println("enter the number:");
		double num;
		num=sc.nextInt();
		System.out.println("enter\n 1 for Square\n 2 for Square root");
		int opt=sc.nextInt();
		switch(opt) {
		case 1:
			Square(num);
		break;
		case 2:
			Squareroot(num);
		break;
		default:
			System.out.println("Invalid Entry!");
		}
		sc.close();
		

	}
	static void Square(double num)
	{
		System.out.println("Square of the num="+num*num);
	}
	static void Squareroot(double num)
	{
		System.out.println("Square root of the num="+Math.sqrt(num));
	}
	}
