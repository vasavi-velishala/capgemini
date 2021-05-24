package day2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Whatsapp {
	
	
	
	void chats() //instance//non static
	//to access this need to create object
	{
		 System.out.print("view chats");
	}
	static void status() //class or static method
	//no need to create object
	{
		 System.out.print("view status");
	}
	void calls()
	{
		 System.out.print("can call");
	}
	public static void main(String[] args) throws Exception {
		
		
		System.out.println("Enter your choice"); 
		//Scanner sc=new Scanner(System.in); //int c=sc.nextInt();
		
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		String b=br.readLine(); 
 int c=Integer.parseInt(b);
		 
		 
		
		
		
		Whatsapp m=new Whatsapp();
		 switch(c) {
		 case 1 : m.calls(); 
		break; 
		case 2: m.chats();
		 break;
		 case 3 : status();
		break; 
		default : System.out.println("wrong choice"); 
		} 
		
		
	}

}
