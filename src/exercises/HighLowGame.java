package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	
	public static void main(String[] args) {
		
		int R = new Random().nextInt(50) + 1;
		
		for (int i=5; i>=0; i--) {
			String numberAsString = JOptionPane.showInputDialog("Guess the nubmer between 1 and 50");
			int numberAsInt = Integer.parseInt(numberAsString);
			
			if (numberAsInt > 0 && numberAsInt <= 50) {
				if (numberAsInt == R) {
					JOptionPane.showMessageDialog(null, "Congratulations! You guess the secret number.");
					System.exit(0);
				}else if (numberAsInt > R) {
					if (i != 0) {
						JOptionPane.showMessageDialog(null, numberAsInt + "is too high," + i + "more tries.");
					} else {
						JOptionPane.showMessageDialog(null, numberAsInt + "is too high. That was your last try.");
					}
				}else {
					if (i != 0) {
						JOptionPane.showMessageDialog(null, "is too low," + i + "more tries.");
					}else {
						JOptionPane.showMessageDialog(null, numberAsInt + "is too low. That was your last try.");
					}
				}
		}else {
			JOptionPane.showMessageDialog(null, "Wrong input, please enter a number between 1 and 50. You have " +i+ "more tries");
		}
	}
		JOptionPane.showMessageDialog(null, "You lose");
		System.exit(0);
	}
		
}
