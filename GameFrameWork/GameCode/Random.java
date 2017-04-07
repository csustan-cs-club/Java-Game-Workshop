package com.acantellano.framework.util;

import java.util.Random;

public class RandomNumberGenerator{
	private static int getRandIntBetween(int lowerBound, int upperBound)
	{
		return rand.nextInt(upperBound - lowerBound) + lowerBound;
	}
	
	private static int getRandInt(int upperBound)
	{
		return rand.nextInt(upperBound);
	}

}