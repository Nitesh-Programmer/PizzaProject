package com.pizzaproject.app;


public class BillingClass 
{
	
	
	 static void yourBill(Pizza p,Pizza p1)
	{
	
		
		if(p1 instanceof VegPizza )
		{
			
			
			System.out.println("UserId "+Pizza.getU1().getUserId());
			System.out.println("UserName: "+Pizza.getU1().getUserName());
			//System.out.println("                     Welcome                       ");
			System.out.println("---------------------------------------------------");
			System.out.println("                 Bill for your order               ");
			System.out.println("---------------------------------------------------");
			System.out.println("   Pizza Name   |       Quantity        |   Bill   ");
			System.out.println("----------------|-----------------------|----------");
			if(p1.getCheesyPizzaFingers()>0)
			{
				System.out.println("Chessy Pizza    |    "+p1.getCheesyPizzaFingers()+"                  |"+74*p1.getCheesyPizzaFingers());
			}
			if(p1.getClassicVeggie()>0)
			{
				System.out.println("Greeky Funghi   |    "+p1.getGreekyFunghi()+"                  |"+175*p1.getGreekyFunghi());
			}
			if(p1.getClassicVeggie()>0)
			{
				System.out.println("Classic Veggie  |    "+p1.getClassicVeggie()+"                  |"+159*p1.getClassicVeggie());
			}
			if(p1.isCheese())
			{
			System.out.println("    Cheese      |        Added          |         ");
			}
			if(p1.isToppings())
			{
			System.out.println("   Toppings     |        Added          |         ");
			}
			if(p1.isTakeAway())
			{
			System.out.println("   TakeAway     |        Added          |          ");
			}
			System.out.println("                |                       |          ");
			System.out.println("Total Quantity  |  "+ p1.getQuantity() + "                    |          ");
			System.out.println("Total Price                             |"+p1.getPrice());
			System.out.println("---------------------------------------------------");
			System.out.println();
			
			
		}
		else if( p1 instanceof NonVegPizza)
		{
			
			System.out.println("UserId "+Pizza.getU1().getUserId());
			System.out.println("UserName: "+Pizza.getU1().getUserName());
			System.out.println("hi");
			System.out.println("---------------------------------------------------");
			System.out.println("                 Bill for your order               ");
			System.out.println("---------------------------------------------------");
			System.out.println("   Pizza Name   |       Quantity        |   Bill   ");
			System.out.println("----------------|-----------------------|----------");
			if(p1.getChickenPizza()>0)
			{
			System.out.println("Chicken Pizza   |    "+p1.getChickenPizza()+"                  |"+150*p1.getChickenPizza());
			}
			if(p1.getPrawnPizza()>0)
			{
				System.out.println("Prawn Pizza     |    "+p1.getPrawnPizza()+"                  |"+250*p1.getPrawnPizza());
			}
			if(p1.getMuttonPizza()>0)
			{
			System.out.println("Mutton Pizza    |    "+p1.getMuttonPizza()+"                  |"+390*p1.getMuttonPizza());
			}
			if(p1.isCheese())
			{
			System.out.println("    Cheese      |        Added          |         ");
			}
			if(p1.isToppings())
			{
			System.out.println("   Toppings     |        Added          |         ");
			}
			if(p1.isTakeAway())
			{
			System.out.println("   TakeAway     |        Added          |          ");
			}
			System.out.println("                |                       |          ");
			System.out.println("Total Quantity  |  "+ p1.getQuantity() + "                    |          ");
			System.out.println("Total Price                             |"+p1.getPrice());
			System.out.println("---------------------------------------------------");
			System.out.println();
				
		}
		
	 if(p!=null&&p1!=null)
	 {
		
		JdbcPizza.input(p, p1);
	 }
		
	}


	

}
