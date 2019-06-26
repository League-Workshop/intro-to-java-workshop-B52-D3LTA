package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String yesno = JOptionPane.showInputDialog(null, "Do you know how to code?");
if (yesno.equals("yes"))		// 2. If they say "yes", tell them they will rule the world.
JOptionPane.showMessageDialog(null, "If you said yes you rule the world"); 
		// 3. Otherwise, wish them good luck washing dishes.
JOptionPane.showMessageDialog(null, "If you said no GG, Good Luck washing the Rulers dishes");
	}
}

