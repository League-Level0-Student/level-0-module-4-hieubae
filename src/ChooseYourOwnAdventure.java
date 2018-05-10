import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String[] args) {
	
	
	String[] options = {"Who are you?", "No, where am I?"};
int choice = JOptionPane.showOptionDialog(null, "Do you know where you are?", "?????", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

if (choice == 0) {
	JOptionPane.showMessageDialog(null, "I am going to eat you! \n		You Died!");
	
	
}

if (choice == 1) {
	String [] options2 = {"Deal", "No thanks."};
choice	= JOptionPane.showOptionDialog(null, "I will ask you one question, and I will summon you back to your house if get the right answer, deal?", "?????", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options2, options2[0]);

	if (choice == 0) {
		String[] options3 = {"Gummy sharks", "Gummy worms"};
		JOptionPane.showOptionDialog(null, "What is better? Gummy sharks or gummy worms?", "?????",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options3, options3[0]);
	}
		if (choice == 1) {
		JOptionPane.showMessageDialog(null, "I guess I have to eat you now... \n	You Died!");
		
	}
		if (choice == 0) {
			JOptionPane.showMessageDialog(null, "You're free to go. *wshshhhhhh*");
}


}
}
}
