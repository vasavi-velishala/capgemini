package day2;

public class SumofOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int sum=0;
			for(int i=1;i<=99;i++)
			{
				if(i%2!=0)
				{
					sum=sum+i;
				}
			}
			System.out.println("The sum of 100 odd numbers are="+sum);
		}
	}

}
