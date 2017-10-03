package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;

public class ToolController
{
	private List<Donut> donutList;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
	}
	
	public void start()
	{
		Donut temp = new Donut(false, false, null, null, 0);
		System.out.println(donutList);
	}
}
