package methods;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you in years?");
		int a = Integer.parseInt(age);
		if (a >= 18) {
			JOptionPane.showInputDialog("Who should the next president be");
		}
		else if(a<=18) {
			JOptionPane.showMessageDialog(null, "nobody cares what you think");
		}
	}
}
