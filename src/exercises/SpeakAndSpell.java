package exercises;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

/**
 * The first Speak & Spell was introduced at the summer Consumer Electronics
 * Show in June 1978, making it one of the earliest hand-held electronic devices
 * with a visual display to use interchangeable game cartridges. 
 * It was my favorite game as a kid.
 * 
 * https://www.youtube.com/watch?v=qM8FcN0aAvU
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		
		int score = 0;
		for (int i=0; i<3; i++) {
			speak("spell woodpecker");
			String A1 = JOptionPane.showInputDialog("Enter the answer:");
			i++;
			if (A1.equals("woodpecker")) {
				speak("correct");
				score++;
			}else {
				speak("wrong");
			}
			speak ("spell magnificent");
			String A2 = JOptionPane.showInputDialog("Enter the answer:");
			i++;
			if (A2.equals("magnificent")) {
				speak("correct");
				score++;
			}else {
				speak("wrong");
			}
			speak ("spell watermelon");
			String A3 = JOptionPane.showInputDialog("Enter the answer:");
			i++;
			if (A3.equals("watermelon")) {
				speak("correct");
				score++;
			}else {
				speak("wrong");
			}
		}
		 		
	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}
