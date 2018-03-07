package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	/*
	 * 1. Ask the user which animal they want, then play the sound of that
	 * animal.
	 */
	String input = JOptionPane.showInputDialog(null, "What animal do you want?");
	if(input.equalsIgnoreCase("cow")) {
		playMoo();
	}
	/* 2. Make it so that the user can keep entering new animals. */
	 
	
	if(input.equalsIgnoreCase("wolf")) {
		playWoof();
	}
	if(input.equalsIgnoreCase("quack")) {
		playQuack();
	}
	if(input.equalsIgnoreCase("cat")) {
		playMeow();
	}
	if(input.equalsIgnoreCase("llama")) {
		playllama();
	}
}



void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}



void playMoo() {
	playNoise(mooFile);
}

String mooFile = "moo.wav";
String quackFile = "quack.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";
void playMeow() {
	playNoise(meowFile);
}
void playllama() {
	playNoise(llamaFile);
}


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();
}

}

