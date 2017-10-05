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
		showTheList();
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
}
