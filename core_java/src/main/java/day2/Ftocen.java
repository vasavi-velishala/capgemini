package day2;

import java.util.Scanner;

public class Ftocen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			float fah;
			double cel;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter temperature in fahrenheit");
			fah=sc.nextFloat();
			cel=(fah-32)/1.8;
			System.out.print("Equivalent temperature in celsius="+cel);
			sc.close();
		}

	}

}
