package com.pizzaproject.app;

import java.util.Scanner;

public class ExecutionClass extends Pizza 
{
	static Scanner s1=new Scanner(System.in);
	
	public static void main(String[] args) throws Exception 
	{
		ExecutionClass e=new ExecutionClass();
		e.execution();
	}
	void execution() throws Exception
	{
		boolean flag=true;
		while (flag)
		{
			System.out.println("Press 1) For UserPage to order pizza");
			System.out.println("Press 2) For AdminPage");
			System.out.println("Press 3) For Exit...");
			int num=AdminPage.input(s1);
			while(num<=0||num>4)
			{
				System.out.println("Enter correct number");
				num=AdminPage.input(s1);
			}
			switch(num)
			{
			case(1):
				
				super.setU1(new UserPage());
				UserPage u1=(UserPage)super.getU1();
				u1.userPage1();
				
				
				break;
			case(2):
				AdminPage.main(null);
 				break;
			case(3):
				System.out.println("Thanks! Visit Again:) ");
				flag=false;
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter correct Number");
				num=AdminPage.input(s1);
			}
		}
		
	}
	
}
