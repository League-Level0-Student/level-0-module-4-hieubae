
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		int pet = JOptionPane.showOptionDialog(null, "What pet do you want to buy?", "Pet Store", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Dog", "Cat", "Unicorn" }, null);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
for (int i = 0; i < 2; i++) {
	

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?",
				"Make the pet happy!", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Cuddle", "Give food", "Take a walk" }, null);

		// 5. Use user input to call the appropriate method created in step 4.
		System.out.println(task);
		if (task == 0) {
			cuddle();
		}
		System.out.println(task);
		if (task == 1) {
			givefood();
		}
		System.out.println(task);
		if (task == 2) {
			walk();
		}


		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
		if (happinessLevel == 20) {
			JOptionPane.showMessageDialog(null, "You love your pet!");
			break;
		}
}
	}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	static void cuddle() {
		happinessLevel = happinessLevel + 10;
		JOptionPane.showMessageDialog(null, "That tickles hahaahhahahahaahahahahahah");
	}

	static void givefood() {
		happinessLevel = happinessLevel + 10;
		JOptionPane.showMessageDialog(null, "Yummy");
	}

	static void walk() {
		happinessLevel = happinessLevel + 10;
		JOptionPane.showMessageDialog(null, "I'm tired");
	}
}
