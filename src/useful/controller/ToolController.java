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
			display.displayText(donutList.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("Jelly-Filled");
		Donut glazed = new Donut("Glazed");
		Donut maple = new Donut("Maple");
		Donut chocolate = new Donut("Chocolate");
		Donut vanillaCustard = new Donut("Vanilla Custard");
		
		donutList.add(jellyFilled);
		donutList.add(glazed);
		donutList.add(maple);
		donutList.add(chocolate);
		donutList.add(vanillaCustard);
	}
}
