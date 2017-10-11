package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ListController
{
	private List<Donut> donutList;
	private PopupDisplay display;
	
	public ListController()
	{
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		donutList.add(temp);
		
		fillTheList();
		changeTheList();
//		showTheList();
		testTheList();
	}
	
	private void showTheList()
	{
		String favorite = "maple glazed";
		for(int index = 0; index < donutList.size(); index ++)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			if (currentFlavor.equalsIgnoreCase(favorite))
			{
				for (int woop = 0; woop < 5; woop += 1)
				{
					display.displayText(currentFlavor + " is the best flavor ever!!!!!");
				}
			}
			for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex + 1));
			}
			display.displayText(donutList.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly-filled");
		Donut glazed = new Donut("glazed");
		Donut maple = new Donut("maple glazed");
		Donut chocolate = new Donut("chocolate");
		Donut vanillaCustard = new Donut("vanilla custard");
		
		donutList.add(jellyFilled);
		donutList.add(glazed);
		donutList.add(maple);
		donutList.add(chocolate);
		donutList.add(vanillaCustard);
	}
	
	private void changeTheList()
	{
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText("The " + removed.getFlavor() + " donut was removed from the list.");
		display.displayText("Now the list is this big: " + donutList.size());
		donutList.add(removed);
		
		display.displayText("This list still contains " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed.");
	}
	
	private void testTheList()
	{
		Donut chocolateSprinkles = new Donut("chocolate w/ sprinkles");
		donutList.add(chocolateSprinkles);
		Donut removed = donutList.remove(1);
		display.displayText("The " + removed.getFlavor() + " donut was removed from the list.");
		donutList.add(removed);
		removed = donutList.set(4, new Donut());
		display.displayText("The " + removed.getFlavor() + " donut was removed from index 4 and replaced by the " + donutList.get(4).getFlavor() + " donut.");
		String donutAdd = display.getResponse("What flavor of donut do you want to add to the list?");
		donutList.add(new Donut(donutAdd));
		for (int index = donutList.size() - 1; index >= 0; index -= 1)
		{
			String flavor = donutList.get(index).getFlavor();
			display.displayText("The " + flavor + " donut is the flavor at index " + index + " in the list.");
		}
//		String unconverted = display.getResponse("What donut would you like to eat? (index)");
//		while (!isValidInteger(unconverted))
//		{
//			display.displayText("What donut would you like to eat?? (index)");
//		}
//		int donutRemove = 0;
//		donutRemove = Integer.parseInt(unconverted);
//		if (donutRemove >= donutList.size() || donutRemove < 0)
//		{
//			unconverted = display.getResponse("That is not a valid index for a donut. Please try again.");
//		}
//		Donut removed2 = donutList.remove(donutRemove);
//		display.displayText("The donut with the flavor " + removed2.getFlavor() + " was removed from index position " + donutRemove + ".");
	}
	
	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
	
	private boolean isValidInteger(String sampleInt)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sampleInt);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			display.displayText("Only integer values are valid: " + sampleInt + " is not.");
		}
		
		return valid;
	}
}
