package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		int h = Integer.parseInt(height);
		if (h >= 48 ) {
			JOptionPane.showMessageDialog(null, "You can ride the RollerCoaster");
		}
		if(h<= 48) {
			JOptionPane.showMessageDialog(null,"You need to grow more");
		}
	}
}