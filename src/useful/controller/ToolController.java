package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

public class ToolController
{
	private List<Donut> donutList;
	private PopupDisplay display;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		donutList.add(temp);
		
		fillTheList();
//		changeTheList();
//		showTheList();
		testTheList();
	}
	
	private void showTheList()
	{
		String favorite = "Maple Glazed";
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
		Donut jellyFilled = new Donut("Jelly-Filled");
		Donut glazed = new Donut("Glazed");
		Donut maple = new Donut("Maple Glazed");
		Donut chocolate = new Donut("Chocolate");
		Donut vanillaCustard = new Donut("Vanilla Custard");
		
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
		Donut chocolateSprinkles = new Donut("Chocolate w/ Sprinkles");
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
			display.displayText(flavor + " is the flavor at spot " + (index + 1) + " in the list.");
		}
	}
}
