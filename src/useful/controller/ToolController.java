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
	}
	
	private void showTheList()
	{
		for(int index = 0; index < donutList.size(); index ++)
		{
			display.displayText(donutList.get(index));
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut(false, false, null, "Jelly-Filled", 0);
		Donut glazed = new Donut(false, false, null, "Glazed", 0);
		Donut maple = new Donut(false, false, null, "Maple", 0);
		Donut chocolate = new Donut(false, false, null, "Chocolate", 0);
		Donut vanillaCustard = new Donut(false, false, null, "Vanilla Custard", 0);
		
		donutList.add(jellyFilled);
		donutList.add(glazed);
		donutList.add(maple);
		donutList.add(chocolate);
		donutList.add(vanillaCustard);
	}
}
