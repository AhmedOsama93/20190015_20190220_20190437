import java.io.*;
import java.util.*;


public class Playground {
	private String name; 
	
	private String location; 
	
	private String type;
	
	private double price;
	
	private String hours[];
	
	private int cntHours;
	
	private Owner owner;
	
	/**
	 * Parameterized Constructor
	 * 
	 * Initializes number of hours and sets the owner. 
	 * 
	 * @param o : Owner of Playground
	 */
	public Playground(Owner o) {
		owner = o;
		cntHours = 0;
	}
	
	/**
	 * Function that takes all the required information about 
	 * the playground from the owner.
	 */
	public void displayPlaygroundForm()
	{
		System.out.print("Name of playground: ");
		
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		name = s;
		
		System.out.print("Location of playground: ");
		
		s = in.nextLine();
		
		location = s;
		
		System.out.print("Type of playground (dimensions and turf): ");
		
		s = in.nextLine();
		
		type = s;
		
		System.out.print("Price per hour: ");
		
		double x = in.nextDouble();
		
		price = x;
		
		System.out.print("Number of hours avaialble per day: ");
		
		int n = in.nextInt();
		
		in.nextLine();
		
		cntHours = n;
		
		hours = new String[cntHours];
		
		for (int i = 0; i < n; i++) {
			String from,to;
			
			System.out.print("From: ");
			
			from = in.nextLine();
			
			System.out.print("To: ");
			
			to = in.nextLine();
			
			hours[i] = "From: " + from + " to " + to;
		}
	}
	
	/**
	 * Function that displays all the information about a playground.
	 */
	public void displayInfo()
	{
		System.out.println("Name of playground: " + name);
		
		System.out.println("Location of playground: " + location);
		
		System.out.println("Type of playground (dimensions and turf): " + type);
		
		System.out.println("Price per Hour: " + price);
		
		System.out.println("Available Hours:");
		
		for (int i = 0; i < cntHours; i++) {
			System.out.println(hours[i]);
		}
	}
	
	/**
	 * Function to get the name of playground.
	 * @return name of playground.
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * Function to get the location of playground.
	 * @return location of playground.
	 */
	public String getLocation() 
	{
		return location;
	}
	
	/**
	 * Function to get the type of playground.
	 * @return type of playground.
	 */
	public String getType() 
	{
		return type;
	}
	
	/**
	 * Function to get the price of playground.
	 * @return price of playground.
	 */
	public double getPrice() 
	{
		return price;
	}
	
	/**
	 * Function to return the owner of playground.
	 * @return owner of playground.
	 */
	public Owner getOwner()
	{
		return owner;
	}
}
