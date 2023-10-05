package com.pizzaproject.app;

public class PremiumPizza extends Pizza
{
		static Pizza p;
	public PremiumPizza() 
	{
		boolean flag=true;
		while(flag)
		{
			System.out.println("Press 1) For Veg-Pizza");
			System.out.println("Press 2) For Non-Veg Pizza");
			System.out.println("Press 3) To go back to MainPage");
			//System.out.println("Press 4) ");
			int num=AdminPage.input(ExecutionClass.s1);
			while(num<=0||num>4)
			{
				System.out.println("Enter correct number");
				num=AdminPage.input(ExecutionClass.s1);
			}
			switch(num)
			{
			case(1):
				p=new VegPizza();
				flag=false;
				break;
			case(2):
				p=new NonVegPizza();
				flag=false;
				break;
			case(3):
				//new UserPage();
				flag=false;
				break;
			default:
				System.out.println("Enter correct number");
				num=AdminPage.input(ExecutionClass.s1);
			}
		}
		
	}
	
}
