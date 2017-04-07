package com.acantellano.game.main;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class Resource{
	public static void load()
	{
		//To-Do
	}
	
	private static AudioClip loadSound(String filename)
	{
		URL fileURL = Resource.class.getResource("/resources/" +filename);
		return Applet.newAudioClip(fileURL);
	}
	
	private static BufferedImage loadImage(String filename)
	{
		BufferedImage img = null;
		img = ImageIO.read(Resources.class.getResourceAsStream("/resources/" + filename));
		return img;
	}
}