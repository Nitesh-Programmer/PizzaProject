package com.pizzaproject.app;

public class VegPizza extends Pizza 
{	
	
		void extraAdd()
		{
		
			switch(UserPage.num1)
			{
			case(1):
					System.out.println("If you need Cheese, you have to pay Rs.10 forEach");
					System.out.println("If you need type Yes or No");
					String s1=ExecutionClass.s1.next();
					while(!s1.equalsIgnoreCase("yes")&&!s1.equalsIgnoreCase("no"))
					{
						System.out.println("Enter correct input either yes or no");
						s1=ExecutionClass.s1.next();
					}
					if(s1.equalsIgnoreCase("yes"))
					{
						
						super.setPrice(10*getQuantity());
						super.setCheese(true);
					}
					System.out.println("If you need Toppings, you have to pay Rs.10 forEach");
					System.out.println("If you need type Yes or No");
					String s2=ExecutionClass.s1.next();
					while(!s2.equalsIgnoreCase("yes")&&!s2.equalsIgnoreCase("no"))
					{
						System.out.println("Enter correct input either yes or no");
						s2=ExecutionClass.s1.next();
					}
					if(s2.equalsIgnoreCase("yes"))
					{
						super.setPrice(10*getQuantity());
						super.setToppings(true);
					}
					System.out.println("If you need Takeaway, you have to pay Rs.10 forEach");
					System.out.println("If you need type Yes or No");
					String s3=ExecutionClass.s1.next();
					while(!s3.equalsIgnoreCase("yes")&&!s3.equalsIgnoreCase("no"))
					{
						System.out.println("Enter correct input either yes or no");
						s3=ExecutionClass.s1.next();
					}
					if(s3.equalsIgnoreCase("yes"))
					{
						super.setPrice(10*getQuantity());
						super.setTakeAway(true);
					}
					break;
			
			case(2):
					System.out.println("If you need Cheese, you have to pay Rs.20 forEach, larger Pizza");
					System.out.println("If you need type Yes or No");
					String s4=ExecutionClass.s1.next();
					while(!s4.equalsIgnoreCase("yes")&&!s4.equalsIgnoreCase("no"))
					{
						System.out.println("Enter correct input either yes or no");
						s4=ExecutionClass.s1.next();
					}
					if(s4.equalsIgnoreCase("yes"))
					{
						super.setPrice(20*getQuantity());
						super.setCheese(true);
					}
					System.out.println("If you need Toppings, you have to pay Rs.20 forEach");
					System.out.println("If you need type Yes or No");
					String s5=ExecutionClass.s1.next();
					while(!s5.equalsIgnoreCase("yes")&&!s5.equalsIgnoreCase("no"))
					{
						System.out.println("Enter correct input either yes or no");
						s5=ExecutionClass.s1.next();
					}
					if(s5.equalsIgnoreCase("yes"))
					{
						super.setPrice(20*getQuantity());
						super.setToppings(true);
					}
					System.out.println("If you need Takeaway, you have to pay Rs.10 forEach");
					System.out.println("If you need type Yes or No");
					String s6=ExecutionClass.s1.next();
					while(!s6.equalsIgnoreCase("yes")&&!s6.equalsIgnoreCase("no"))
					{
						System.out.println("Enter correct input either yes or no");
						s6=ExecutionClass.s1.next();
					}
					if(s6.equalsIgnoreCase("yes"))
					{
						super.setPrice(10*getQuantity());
						super.setTakeAway(true);
					}
					break;
			case(3):
					System.out.println("If you need Cheese, you have to pay Rs.40 forEach, extra spices are added and much more taste");
					System.out.println("If you need type Yes or No");
					String s7=ExecutionClass.s1.next();
					while(!s7.equalsIgnoreCase("yes")&&!s7.equalsIgnoreCase("no"))
					{
						System.out.println("Enter correct input either yes or no");
						s7=ExecutionClass.s1.next();
					}
					if(s7.equalsIgnoreCase("yes"))
					{
						super.setPrice(40*getQuantity());
						super.setCheese(true);
					}
					System.out.println("If you need Toppings, you have to pay Rs.40 forEach");
					System.out.println("If you need type Yes or No");
					String s8=ExecutionClass.s1.next();
					while(!s8.equalsIgnoreCase("yes")&&!s8.equalsIgnoreCase("no"))
					{
						System.out.println("Enter correct input either yes or no");
						s8=ExecutionClass.s1.next();
					}
					if(s8.equalsIgnoreCase("yes"))
					{
						super.setPrice(40*getQuantity());
						super.setToppings(true);
					}
					System.out.println("If you need Takeaway, you have to pay Rs.10 forEach");
					System.out.println("If you need type Yes or No");
					String s9=ExecutionClass.s1.next();
					while(!s9.equalsIgnoreCase("yes")&&!s9.equalsIgnoreCase("no"))
					{
						System.out.println("Enter correct input either yes or no");
						s9=ExecutionClass.s1.next();
					}
					if(s9.equalsIgnoreCase("yes"))
					{	
						super.setPrice(10*getQuantity());
						super.setTakeAway(true);
					}
					break;
			}
		}
	public VegPizza() 
	{
		System.out.println("Press 1) Cheesy Pizza--Rs.74");
		System.out.println("Press 2) Greeky Funghi --Rs.175");
		System.out.println("Press 3) Classic Veggie Crunch--Rs.159");
		System.out.println("Press 4) To go back to NormalPizza page");
		vegOrder();
		System.out.println("Chessy Pizza Fingers : "+ super.getCheesyPizzaFingers());
		System.out.println("Greeky Funghi        : "+ super.getGreekyFunghi());
		System.out.println("Classic Veggie Crunch: "+ super.getClassicVeggie());
		System.out.println("Total Quantity       : "+ super.getQuantity());
		System.out.println("Total Price          : "+ super.getPrice());
		System.out.println();
		extraAdd();
	}

	void vegOrder()
	{

		int num=AdminPage.input(ExecutionClass.s1);
		while(num<=0||num>4)
		{
			System.out.println("Enter correct number");
			num=AdminPage.input(ExecutionClass.s1);
		}
		boolean flag=true;
		int quantity=0;
		while(quantity<=0)
		{
			if(num<4&&num>0)
			{
				System.out.println("Enter correct quantity");
				quantity=AdminPage.input(ExecutionClass.s1);	
			}
		}
		if(num==1)
		{
			super.setCheesyPizzaFingers(+quantity);
			//System.out.println(super.getCheesyPizzaFingers());
			super.setQuantity(+quantity);
		}
		else if(num==2)
		{
			super.setGreekyFunghi(quantity);
			super.setQuantity(quantity);
		}
		else if(num==3)
		{
			super.setClassicVeggie(quantity);
			super.setQuantity(quantity);
		}
		while(flag)
		{
			switch(num)
			{
			case(1):

				super.setPrice(+74*quantity);
			System.out.println("If you need More press given number or press 4");
			num=AdminPage.input(ExecutionClass.s1);
			while(num<=0||num>4)
			{
				System.out.println("Enter correct number ");
				num=AdminPage.input(ExecutionClass.s1);
			}
			if(num==4)
			{
				flag=false;
				break;
			}
			if(num<4&&num>0)
			{	
				System.out.println("Enter the quantity ");
				quantity=AdminPage.input(ExecutionClass.s1);
				while(quantity<=0)
				{
						System.out.println("Enter the quantity");
						quantity=AdminPage.input(ExecutionClass.s1);
				}
				if(num==1)
				{
					super.setQuantity(quantity);
					super.setCheesyPizzaFingers(quantity);
				}
				else if(num==2)
				{
					super.setQuantity(quantity);
					super.setGreekyFunghi(quantity);
				}
				else if(num==3)
				{
					super.setQuantity(quantity);
					super.setClassicVeggie(quantity);
				}
			}
			
			break;
			case(2):

				super.setPrice(+175*quantity);
			System.out.println("If you need More press given number or press 4");
			num=AdminPage.input(ExecutionClass.s1);
			while(num<=0||num>4)
			{
				System.out.println("Enter correct number ");
				num=AdminPage.input(ExecutionClass.s1);
			}
			if(num==4)
			{
				flag=false;
				break;
			}
			if(num<4&&num>0)
			{	
				System.out.println("Enter the quantity ");
				quantity=AdminPage.input(ExecutionClass.s1);
				while(quantity<=0)
				{
					if(num<4&&num>0)
					{
						System.out.println("Enter correct quantity");
						quantity=AdminPage.input(ExecutionClass.s1);
					}
				}
				if(num==1)
				{
					super.setQuantity(quantity);
					super.setCheesyPizzaFingers(quantity);
				}
				else if(num==2)
				{
					super.setQuantity(quantity);
					super.setGreekyFunghi(quantity);
				}
				else if(num==3)
				{
					super.setQuantity(quantity);
					super.setClassicVeggie(quantity);
				}	
			}
					break;
			case(3):

				super.setPrice(+159*quantity);
			System.out.println("If you need More press given number or press 4");
			num=AdminPage.input(ExecutionClass.s1);
			while(num<=0||num>4)
			{
				System.out.println("Enter correct number ");
				num=AdminPage.input(ExecutionClass.s1);
			}
			if(num==4)
			{
				flag=false;
				break;
			}
			if(num<4&&num>0)
			{	
				System.out.println("Enter the quantity ");
				quantity=AdminPage.input(ExecutionClass.s1);
				while(quantity<=0)
				{
					if(num<4&&num>0)
					{
						System.out.println("Enter correct quantity");
						quantity=AdminPage.input(ExecutionClass.s1);	
					}
				}
				if(num==1)
				{
					super.setQuantity(quantity);
					super.setCheesyPizzaFingers(quantity);
				}
				else if(num==2)
				{
					super.setQuantity(quantity);
					super.setGreekyFunghi(quantity);
				}
				else if(num==3)
				{
					super.setQuantity(quantity);
					super.setClassicVeggie(quantity);
				}	
			}
			break;
			case(4):
				System.out.println("Case 4");
				flag=false;
				break;
			default:
				System.out.println("Enter correct number");
				num=AdminPage.input(ExecutionClass.s1);
				while(num<=0||num>4)
				{
					System.out.println("Enter correct number");
					num=AdminPage.input(ExecutionClass.s1);
				}
				System.out.println("Enter the quantity ");
				quantity=AdminPage.input(ExecutionClass.s1);
				while(quantity<=0)
				{
					if(num<4&&num>0)
					{
						System.out.println("Enter correct quantity");
						quantity=AdminPage.input(ExecutionClass.s1);	
					}
				}
				if(num==1)
				{
					super.setQuantity(quantity);
					super.setCheesyPizzaFingers(quantity);
				}
				else if(num==2)
				{
					super.setQuantity(quantity);
					super.setGreekyFunghi(quantity);
				}
				else if(num==3)
				{
					super.setQuantity(quantity);
					super.setClassicVeggie(quantity);
				}
			}
		}
	}
}
