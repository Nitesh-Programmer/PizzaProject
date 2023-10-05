package com.pizzaproject.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AdminPage 
{
	
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Enter the password");
		String s=ExecutionClass.s1.next();
		if(s.equals("Java"))
		{
			System.out.println("Welcome Mr.Admin");
			dataBase();
		}
		else
		{
			System.out.println("Please Enter correct Password");
			s=ExecutionClass.s1.next();
		}
	}
	static int input(Scanner s1)
	{
		
		try {
		return s1.nextInt();
		}
		catch (Exception e) 
		{
			s1.next();
			System.out.println("Please enter correct number...");
			return input(s1);
		}
		
	}
	static void dataBase() throws Exception
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs;
		boolean flag=true;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Press 1) For full details");
		System.out.println("Press 2) For Normal Pizza details");
		System.out.println("Press 3) For Luxury Pizza details");
		System.out.println("Press 4) For Premium Pizza details");
		System.out.println("Press 5) For Total quantity of Pizza sold");
		System.out.println("Press 6) For Total Price sold");
		System.out.println("Press 7) To go back to main Method");
		int num = input(ExecutionClass.s1);
		
		
		while(num<=0||num>7)
		{
			System.out.println("Enter correct number");
			 num = input(ExecutionClass.s1);;
		}
		
		while(flag)
		{
			switch(num)
			{
			case(1):
					
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&&password=root");
					pstmt=con.prepareStatement("select * from pizza");
					rs=pstmt.executeQuery();
					while(rs.next())
					{
						System.out.println("ID: "+rs.getInt(1));
						System.out.println("UserName: "+rs.getString(2));
						System.out.println("Brand: "+rs.getString(3));
						System.out.println("Type of Pizza: "+rs.getString(4));
						System.out.println("Extra Spices: "+rs.getString(5));
						System.out.println("Quantity :"+rs.getInt(6));
						System.out.println("Total Price :"+rs.getDouble(7));
						System.out.println("-------------------");
					}
					System.out.println("Any other details you need");
					 num = input(ExecutionClass.s1);
					while(num<=0||num>7)
					{
						System.out.println("Enter correct number");
						 num = input(ExecutionClass.s1);
					}
					
					break;
			case(2):
					
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&&password=root");
					pstmt=con.prepareStatement("select * from pizza where BrandPizza Like 'Normal%'");
					 rs=pstmt.executeQuery();
					while(rs.next())
					{
						System.out.println("ID: "+rs.getInt(1));
						System.out.println("UserName: "+rs.getString(2));
						System.out.println("Brand: "+rs.getString(3));
						System.out.println("Type of Pizza: "+rs.getString(4));
						System.out.println("Extra Spices: "+rs.getString(5));
						System.out.println("Quantity: "+rs.getInt(6));
						System.out.println("Total Price: "+rs.getDouble(7));
						System.out.println("-------------------");
					}
					System.out.println("Any other details you need");
					 num = input(ExecutionClass.s1);
					while(num<=0||num>7)
					{
						System.out.println("Enter correct number");
						 num = input(ExecutionClass.s1);
					}
					break;
			case(3):
					
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&&password=root");
					pstmt=con.prepareStatement("select * from pizza where BrandPizza Like 'Lu%'");
					 rs=pstmt.executeQuery();
					while(rs.next())
					{
						System.out.println("ID: "+rs.getInt(1));
						System.out.println("UserName: "+rs.getString(2));
						System.out.println("Brand: "+rs.getString(3));
						System.out.println("Type of Pizza: "+rs.getString(4));
						System.out.println("Extra Spices: "+rs.getString(5));
						System.out.println("Quantity: "+rs.getInt(6));
						System.out.println("Total Price: "+rs.getDouble(7));
						System.out.println("-------------------");
					}
					System.out.println("Any other details you need");
					 num = input(ExecutionClass.s1);
					while(num<=0||num>7)
					{
						System.out.println("Enter correct number");
						 num = input(ExecutionClass.s1);
					}
					break;
			case(4):
					
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&&password=root");
					pstmt=con.prepareStatement("select * from pizza where BrandPizza Like 'Pre%'");
					 rs=pstmt.executeQuery();
					while(rs.next())
					{
						System.out.println("ID : "+rs.getInt(1));
						System.out.println("UserName: "+rs.getString(2));
						System.out.println("Brand: "+rs.getString(3));
						System.out.println("Type of Pizza: "+rs.getString(4));
						System.out.println("Extra Spices: "+rs.getString(5));
						System.out.println("Quantity: "+rs.getInt(6));
						System.out.println("Total Price: "+rs.getDouble(7));
						System.out.println("-------------------");
					}
					System.out.println("Any other details you need");
					 num = input(ExecutionClass.s1);
					while(num<=0||num>7)
					{
						System.out.println("Enter correct number");
						 num = input(ExecutionClass.s1);
					}
					break;
			case(5):
					
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&&password=root");
					pstmt=con.prepareStatement("select sum(Quantity)from pizza ");
					 rs=pstmt.executeQuery();	
					 while(rs.next())
					 {
						 System.out.println("Total Quantity:"+rs.getInt(1));
					 }
					 System.out.println("Any other details you need");
						 num = input(ExecutionClass.s1);
						while(num<=0||num>7)
						{
							System.out.println("Enter correct number");
							 num = input(ExecutionClass.s1);
						}
						break;
			case(6):
					
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&&password=root");
					pstmt=con.prepareStatement("select sum(TotalPrice) from pizza");
					rs=pstmt.executeQuery();
					while(rs.next())
					 {
						 System.out.println("Total Price:"+rs.getInt(1));
					 }System.out.println("Any other details you need");
						 num = input(ExecutionClass.s1);
						while(num<=0||num>7)
						{
							System.out.println("Enter correct number");
							 num = input(ExecutionClass.s1);
						}
						break;
			case(7):
				flag=false;
				System.out.println("Thank you!");
				ExecutionClass.main(null);
				break;
				
			}
		
		}

	}
	
}
