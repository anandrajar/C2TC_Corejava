package project_pgm;

import java.util.Scanner;

public class Commission {
	String name;
	String address;
	int phone;
	float sales_amount;
	
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		name = s.nextLine();
		System.out.println("Enter the name");
		System.out.println("");
		
		address = s.nextLine();
		System.out.println("Enter the address");
		
		phone = s.nextInt();
		System.out.println("Enter the phone number");

		sales_amount = s.nextFloat();
		System.out.println("Enter the sales amount");
		
	}
	
	void compute()
	{
		Scanner s = new Scanner(System.in);
		
		int commissions = s.nextInt();
		System.out.println("Enter the commisison");
		
		if(commissions<=10000) {
			commissions=commissions *10;
		}
		else if(5000 <= commissions <3000) {
			commissions=commissions*5;
		}
		else (30000 <= commissions <5000){
			commissions=commissions*3;
		}
		
		System.out.println("The commission "+ commissions);
	}
	
	void display()
	{
		System.out.println(" Name is "+ name);
		System.out.println("Address :" + address);
		System.out.println("Phone  "+ phone);
		System.out.println("Sales amount is "+sales_amount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commission cm = new Commission();
		cm.input();
		cm.compute();
		cm.display();

	}

}
