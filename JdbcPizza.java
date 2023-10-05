package com.pizzaproject.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPizza 
{	
	static void input(Pizza p,Pizza p1)
	{
		Connection conn=null;
		PreparedStatement pstmt=null;
		if(p1 instanceof VegPizza)
		{
			try 
			{ 	
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&&password=root");
				pstmt=conn.prepareStatement("insert into pizza values(?,?,?,?,?,?,?)");
				PreparedStatement count=conn.prepareStatement("select count(idPizza) from pizza");
				ResultSet rs1=count.executeQuery();
				int id=0;
				if(rs1.next())
				{
					id=rs1.getInt(1);
				}
				pstmt.setInt(1, (id+1));
				System.out.println(id+" your id is");
				pstmt.setString(2, Pizza.getU1().getUserName());
				if(UserPage.num1==1)
				{
					pstmt.setString(3,"Normal");
				}
				else if(UserPage.num1==2)
				{
					pstmt.setString(3,"Luxury");
				}
				else if(UserPage.num1==3)
				{
					pstmt.setString(3,"Premium");
				}
				pstmt.setString(4,"VegPizza");
				if(p1.isTakeAway()||p1.isToppings()||p1.isCheese())
				{
					pstmt.setString(5, "Added");
				}
				else
				{
					pstmt.setString(5, "Not Added");
				}
				
				pstmt.setInt(6, p1.getTotalquantity());
				pstmt.setDouble(7,p1.getPrice());
				int res=pstmt.executeUpdate();
				System.out.println(res);
				
			}
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				if(conn!=null)
				{
					try 
					{
						conn.close();
					} 
					catch (SQLException e) 
					{
						e.printStackTrace();
					}
				}
				if(pstmt!=null)
				{
					try 
					{
						pstmt.close();
					}
					catch (SQLException e) 
					{
						e.printStackTrace();
					}
				}	
			}
		}
		if(p1 instanceof NonVegPizza)
		{
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&&password=root");
				pstmt=conn.prepareStatement("insert into pizza values(?,?,?,?,?,?,?)");
				pstmt.setInt(1, (int)Math.random());
				pstmt.setString(2, Pizza.getU1().getUserName());
				if(UserPage.num1==1)
				{
					pstmt.setString(3,"Normal");
				}
				else if(UserPage.num1==2)
				{
					pstmt.setString(3,"Luxury");
				}
				else if(UserPage.num1==3)
				{
					pstmt.setString(3,"Premium");
				}
				if(p1.isTakeAway()||p1.isToppings()||p1.isCheese())
				{
					pstmt.setString(5, "Added");
				}
				else
				{
					pstmt.setString(5, "Not Added");
				}
				pstmt.setString(4,"NonVegPizza");
				pstmt.setInt(6, p1.getTotalquantity());
				pstmt.setDouble(7,p1.getPrice());
				int res=pstmt.executeUpdate();
				System.out.println(res);
				
			}
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				if(conn!=null)
				{
					try 
					{
						conn.close();
					} 
					catch (SQLException e) 
					{
						e.printStackTrace();
					}
				}
				if(pstmt!=null)
				{
					try 
					{
						pstmt.close();
					}
					catch (SQLException e) 
					{
						e.printStackTrace();
					}
				}
				
			}
		}
	}
}