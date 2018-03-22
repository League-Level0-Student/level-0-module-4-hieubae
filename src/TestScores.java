import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog(null, "What did you get on the test?");
	double test = Double.parseDouble(score);
	if (test < 50) {
		JOptionPane.showMessageDialog(null, "You need to study more! Dummy head.");
	}
	else if (test < 75) {	
	
	
		JOptionPane.showMessageDialog(null, "Wowiez! You must have studied really hard for that test!");
	}
	
	else {
		JOptionPane.showMessageDialog(null, "That's good!");
	}
	
	
}
}
