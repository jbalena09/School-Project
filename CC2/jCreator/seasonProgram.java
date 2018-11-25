/* Programmer: Julius
 * Date: 10/01/18
 */

import javax.swing.JOptionPane;


public class seasonProgram{
	public static void main(String[] args)
		{

			int month = Integer.parseInt(JOptionPane.showInputDialog("Enter month(1-12): "));
			if (month <= 3)
				{
					JOptionPane.showMessageDialog(null,"It's winter.");
				}
			else if (month <= 6)
				{
					JOptionPane.showMessageDialog(null,"It’s spring.");
				}
			else if (month <= 9)
				{
					JOptionPane.showMessageDialog(null,"It’s summer.");
				}
			else if(month <= 12)
				{
					JOptionPane.showMessageDialog(null,"It’s autumn.");
				}
			else
				{
				JOptionPane.showMessageDialog(null,"Invalid month!");
				}
		}
}