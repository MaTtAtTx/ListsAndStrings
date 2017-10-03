package useful.model;

public class Donut
{
	private boolean hasSprinkles;
	private boolean isGlazed;
	private String shape;
	private String flavor;
	private int holeCount;
	
	public Donut(boolean hasSprinkles, boolean isGlazed, String shape, String flavor, int holeCount)
	{
		this.hasSprinkles = hasSprinkles;
		this.isGlazed = isGlazed;
		this.shape = shape;
		this.flavor = flavor;
		this.holeCount = holeCount;
	}
	
	//Getters
	public boolean getHasSprinkles()
	{
		return hasSprinkles;
	}
	public boolean getIsGlazed()
	{
		return isGlazed;
	}
	public String getShape()
	{
		return shape;
	}
	public String getFlavor()
	{
		return flavor;
	}
	public int getHoleCount()
	{
		return holeCount;
	}
	
	//Setters
	public void setHasSprinkles(boolean hasSprinkles)
	{
		this.hasSprinkles = hasSprinkles;
	}
	public void setIsGlazed(boolean isGlazed)
	{
		this.isGlazed = isGlazed;
	}
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	public void setFlavor(String flavor)
	{
		this.flavor = flavor;
	}
	public void setHoleCount(int holeCount)
	{
		this.holeCount = holeCount;
	}
}
