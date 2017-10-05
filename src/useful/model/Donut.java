package useful.model;

public class Donut
{
	private boolean hasSprinkles;
	private boolean isGlazed;
	private String shape;
	private String flavor;
	private int holeCount;
	
	public Donut()
	{
		this.hasSprinkles = false;
		this.isGlazed = false;
		this.shape = "round";
		this.flavor = "plain";
		this.holeCount = 1;
	}
	
	public Donut(String flavor)
	{
		this.flavor = flavor;
	}
	
	public String getShape()
	{
		return shape;
	}
	public String getFlavor()
	{
		return flavor;
	}
	
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	
	public String toString()
	{
		String description = "This donut is a " + flavor + "donut.";
		
		return description;
	}
}
