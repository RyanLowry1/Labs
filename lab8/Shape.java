// Name : Ryan Lowry
// Date : 25/11/2025
// Student Number : C00305950
public abstract class Shape
{
	private String name;
	private String colour;
	
	public Shape(String name, String colour)
  	{ 
  		this.name = name; 
  		this.colour = colour; 
  	} 
  	
  	public String toString()
  	{
  		return ("---\nShape Name = " + this.name + "\nShape colour = " + this.colour);
  	}
  	
  	public abstract double area();
}