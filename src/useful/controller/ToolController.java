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
		Donut temp = new Donut(false, false, null, null, 0);
		
		donutList.add(temp);
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut(false, false, null, "Jelly-Filled", 0);
		Donut glazed = new Donut(false, false, null, "Glazed", 0);
		Donut maple = new Donut(false, false, null, "Maple", 0);
		Donut chocolate = new Donut(false, false, null, "Chocolate", 0);
		Donut vanillaCustard = new Donut(false, false, null, "Vanilla Custard", 0);
	}
}
