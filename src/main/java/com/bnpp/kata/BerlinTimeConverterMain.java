package com.bnpp.kata;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BerlinTimeConverterMain {
	static Logger logger = Logger.getLogger(BerlinTimeConverterMain.class.getName());

	public String getEntireBerlinClock(String inTime) {
		BerlinTimeConverter berlinTimeConverter = new BerlinTimeConverter();
		return berlinTimeConverter.getBerlinClock(inTime);
	}

	public static void main(String args[]) {
		String berlinClock;
		BerlinTimeConverterMain main = new BerlinTimeConverterMain();
		logger.info("Enter the Time (HH:MM:SS) :");
		Scanner input = new Scanner(System.in);
		berlinClock = main.getEntireBerlinClock(input.next());
		logger.log(Level.SEVERE, "Berlin clock: {0} ", berlinClock);
	}

}