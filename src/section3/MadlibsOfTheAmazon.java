package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		 JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it... ");
		// Get the user to enter an adjective
		String adjective = JOptionPane.showInputDialog("The the piranha's are very_____");
		// Get the user to enter a type of liquid
String liquid = JOptionPane.showInputDialog("The Piranha's are in the river which contains _______, which is what you need to drink");
		// Get the user to enter a body part
JOptionPane.showMessageDialog(null, "You've fallen into the river and the piranha's are coming for you!");
String BodyPart = JOptionPane.showInputDialog("The Piranha's bite you on the________");
		// Get the user to enter a verb
String Verb = JOptionPane.showInputDialog("You ______ fast to get out of the water");
		// Get the user to enter a place
String Place = JOptionPane.showInputDialog("You see a ______, and you enter it.");
		// Fit the user's words into this sentence, and save it in a String: 
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
String story = "The piranhas are very"+adjective+ "The Piranhas are in the river which contains"+liquid+ "which you need to drink,The Piranhas bite you on the"+BodyPart+"You"+Verb+ "to get out of the water fast,\n You see a" +Place+ "and you enter to get some rest AFTER GOING THROUGH THE AMAZON";
JOptionPane.showMessageDialog(null, story);

	}
}

