package section4;

import java.net.URI;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {

		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal
		// to 100)
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set
		// it equal to 100)
		int dragonHealth = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDamage = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage = 0;

		// 6. Delete the slashes at the beginning of the next line.
		while (playerHealth > 0 && dragonHealth > 0) { // this line of code keeps the battle going until someone's
														// health reaches 0

			// 7. Add a closing mustache at the very bottom of this program (since we just
			// added an opening mustache on the previous step).

			// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick
			String answer = JOptionPane.showInputDialog(null, "Do you want to attack with yell or kick?");
			// 9. If they typed in "yell":
			if (answer.equals("yell")) {
				// -- Find a random number between 0 and 10 and store it in dragonDamage
				dragonDamage = new Random().nextInt(21);
				playerDamage -= new Random().nextInt(16);
				dragonHealth -= dragonDamage;
			}
			if (answer.equals("kick")) {
				dragonDamage = new Random().nextInt(32
						
						
						);
				dragonHealth -= dragonDamage;
			}

			// 11. Find a random number between 0 and 35 and store it in playerDamage
			playerDamage += new Random().nextInt(34);
			// 12. Subtract this number from the player's health
			playerHealth -= playerDamage;
			playerDamage = 0;

			// 13. If the user's health is less than or equal to 0
			if (playerHealth <= 0) {
				JOptionPane.showMessageDialog(null, "U died lol");
			}

			// -- Tell the user that they lost
			if (dragonHealth <= 0) {
				ImageIcon dead = new ImageIcon("src/section4/DragonDead.png");
				JOptionPane.showMessageDialog(null, "U killed him yay", "Dragon Fighter", 0, dead);
				treasureFound();
				
				
			}

			// 14. Else if the dragon's health is less than or equal to 0

			// -- Tell the user that the dragon is dead and they took a ton of gold!

			// 15. Else
			else {
				JOptionPane.showMessageDialog(null,
						playerHealth + " is your health and the dragon has " + dragonHealth + " health!");
			}

		}

	}
	static void treasureFound() {
		try {
			URI uri = new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

