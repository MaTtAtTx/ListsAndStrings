package useful.view;

import javax.swing.JOptionPane;

/**
 * The popup class for CTEC :)
 * @author Matthew Johnsen
 * @version 1.0 03.10.2017
 */
public class PopupDisplay
{
	/**
	 * Displays the supplied message in a popup window.
	 * @param message The message that is displayed.
	 */
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	/**
	 * Displays the supplied question in a popup and returns the answer as a String.
	 * @param fromQuestion The question to ask the user
	 * @return The String answer
	 */
	public String getResponse(String fromQuestion)
	{
		String response = "";

		response += JOptionPane.showInputDialog(null, fromQuestion);

		return response;
	}
}
