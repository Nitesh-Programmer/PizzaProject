package com.pizzaproject.app;

public class Pizza 
{

	private int totalquantity;
	private int CheesyPizzaFingers;
	private int GreekyFunghi;
	private int ClassicVeggie;
	private int ChickenPizza;
	private int PrawnPizza;
	private int MuttonPizza;
	private int userId;
	private String userName;
	static private Pizza u1;
	private boolean cheese;
	private boolean toppings;
	private boolean takeAway;
	private double price;
	 
	public boolean isCheese() {
		return cheese;
	}
	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}
	public boolean isToppings() {
		return toppings;
	}
	public void setToppings(boolean toppings) {
		this.toppings = toppings;
	}
	public boolean isTakeAway() {
		return takeAway;
	}
	public void setTakeAway(boolean takeAway) {
		this.takeAway = takeAway;
	}
	public int getTotalquantity() {
		return totalquantity;
	}
	
	
	static public Pizza getU1() {
		return u1;
	}
	public void setU1(Pizza u1) {
		Pizza.u1 = u1;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getChickenPizza() {
		return ChickenPizza;
	}
	public void setChickenPizza(int chickenPizza1) {
		this.ChickenPizza = ChickenPizza+chickenPizza1;
	}
	public int getPrawnPizza() {
		return PrawnPizza;
	}
	public void setPrawnPizza(int prawnPizza1) {
		this.PrawnPizza = PrawnPizza+prawnPizza1;
	}
	public int getMuttonPizza() {
		return MuttonPizza;
	}
	public void setMuttonPizza(int muttonPizza1) {
		this.MuttonPizza = MuttonPizza+ muttonPizza1;
	}
	public int getCheesyPizzaFingers() {
		return CheesyPizzaFingers;
	}
	public void setCheesyPizzaFingers(int cheesyPizzaFingers1) {
		this.CheesyPizzaFingers =this.CheesyPizzaFingers+cheesyPizzaFingers1;
	}
	public int getGreekyFunghi() {
		return GreekyFunghi;
	}
	public void setGreekyFunghi(int greekyFunghi1) {
		this.GreekyFunghi = this.GreekyFunghi+greekyFunghi1;
	}
	public int getClassicVeggie() {
		return ClassicVeggie;
	}
	public void setClassicVeggie(int classicVeggie1) {
		this.ClassicVeggie =this.ClassicVeggie+classicVeggie1;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price1) {
		this.price = price+price1;
	}
	public int getQuantity() {
		return totalquantity;
	}
	public void setQuantity(int totalquantity1) {
		this.totalquantity = totalquantity+totalquantity1;
	}
	
	
	
	
	
}
