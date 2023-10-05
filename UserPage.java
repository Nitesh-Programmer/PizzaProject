package com.pizzaproject.app;


public class UserPage  extends Pizza
{
	
	
	
	static int num1;
		void userPage1() throws Exception
		{
		
			System.out.println("Enter User Name");
			String s=ExecutionClass.s1.next();
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='0'&&s.charAt(i)<='9')
				{
					System.out.println("Enter correct name");
					s=ExecutionClass.s1.next();
					break;
				}
			}
			super.setUserName(s);
			System.out.println("UserName: "+super.getUserName());
						
			userPage();		
		}
	
		static Pizza up;
	void userPage() throws Exception
	{
		boolean flag=true;
		while(flag)
		{
			System.out.println("Press 1) For Normal Pizza");
			System.out.println("Press 2) For Luxury Pizza");
			System.out.println("Press 3) For Premium Pizza");
			System.out.println("Press 4) To go back ");
			 num1=AdminPage.input(ExecutionClass.s1);
			while(num1<=0||num1>4)
			{
				System.out.println("Enter correct num1ber");
				num1=AdminPage.input(ExecutionClass.s1);
			}
			switch(num1)
			{
			case(1):
				
				up=new NormalPizza();
				flag=false;
				break;
			case(2):
				up=new LuxuryPizza();
				flag=false;
				break;
			case(3):
				up=new PremiumPizza();
				flag=false;
				break;
			case(4):
				ExecutionClass.main(null);
				break;
			default:
				System.out.println("Please enter correct num1ber...");
				num1=AdminPage.input(ExecutionClass.s1);
			}
		}

		switch(num1)
		{
		case(1):
			
				BillingClass.yourBill(super.getU1(),NormalPizza.p);
				break;
		case(2):
				BillingClass.yourBill(UserPage.up, LuxuryPizza.p);
				break;
		case(3):
				BillingClass.yourBill(UserPage.up,PremiumPizza.p);
				break;
		case(4):
			break;
		}
		
	}
	
}
