/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class SafeCracker {

	public static void main(String[] args) {
		for (int i = 0; i <= 9999999; i++) {
		
		tryCode(i);
	}
	}

	static void tryCode(int guess) {
		System.out.println("trying " + guess);

		int secretCode = 9999999 - wekncrzpasfdkjhcfjse;

		if (guess == secretCode) {
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
			playTheSoundOfSuccess();
			System.exit(0);
		}
	}

	private static void playTheSoundOfSuccess() {
		try {
			File soundFile = new File("/Users/League/Google Drive/league-sounds/me-gusta.wav");
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	final static int wekncrzpasfdkjhcfjse = new Random().nextInt(100);
}
