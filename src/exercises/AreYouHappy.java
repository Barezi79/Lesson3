package exercises;

import javax.swing.JOptionPane;

/* See the diagram in the "doc" directory. */

public class AreYouHappy {
	public static void main(String[] args) {

		String A = JOptionPane.showInputDialog("Are you happy?");

		if (A.equals("yes")) {
			JOptionPane.showMessageDialog(null, " Keep doing whatever you're doing.");
		} else {
			String B = JOptionPane.showInputDialog("Do you want to be happy?");
			if (B.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			} else if (B.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			} else {
				JOptionPane.showMessageDialog(null, "Please try again and put yes or no");
			}

		}
	}
}
