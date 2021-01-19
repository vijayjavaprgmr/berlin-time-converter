package com.bnpp.kata;

import java.util.Arrays;

public class BerlinTimeConverter {

	public String getBottomMinutes(String berlinTime) {
		int[] berlinTimeExtract = Arrays.asList(berlinTime.split(":")).stream().mapToInt(Integer::parseInt).toArray();
		StringBuilder outSignal = new StringBuilder();
		int onSigns = berlinTimeExtract[1] % 5;
		for (int i = 0; i < onSigns; i++) {
			outSignal.append("Y");
		}
		for (int j = 0; j < (4 - onSigns); j++) {
			outSignal.append("O");
		}
		return outSignal.toString();
	}

	public String getTopMinutes(String berlinTime) {
		int[] berlinTimeExtract = Arrays.asList(berlinTime.split(":")).stream().mapToInt(Integer::parseInt).toArray();
		StringBuilder outSignal = new StringBuilder();
		int onSigns = (berlinTimeExtract[1] - (berlinTimeExtract[1] % 5)) / 5;
		for (int i = 0; i < onSigns; i++) {
			outSignal.append("Y");
		}
		for (int j = 0; j < (11 - onSigns); j++) {
			outSignal.append("O");
		}
		return outSignal.toString().replace("YYY", "YYR");
	}

}