package day2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int number=sc.nextInt();
		System.out.print("Reverse of "+number+" is");
		int reverse=0;
		String s = "";
		while(number!=0)
		{
			int pick_last = number%10;
			s=s+Integer.toString(pick_last);
			number=number/10;
		}
		System.out.print(s);
		sc.close();

	}

}
