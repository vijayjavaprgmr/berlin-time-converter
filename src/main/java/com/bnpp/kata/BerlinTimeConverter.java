package com.bnpp.kata;

import java.util.Arrays;

public class BerlinTimeConverter {

	public String getBottomMinutes(String berlinTime) {
		int[] berlinTimeExtract = getTimeExtract(berlinTime);
		StringBuilder outBottomMinutes = new StringBuilder();
		int onSigns = berlinTimeExtract[1] % 5;
		outBottomMinutes.append(getOnOff(4, onSigns, "Y"));
		return outBottomMinutes.toString();
	}

	public String getTopMinutes(String berlinTime) {
		int[] berlinTimeExtract = getTimeExtract(berlinTime);
		StringBuilder outTopMinutes = new StringBuilder();
		int onSigns = (berlinTimeExtract[1] - (berlinTimeExtract[1] % 5)) / 5;
		outTopMinutes.append(getOnOff(11, onSigns, "Y"));
		return outTopMinutes.toString().replace("YYY", "YYR");
	}

	private String getOnOff(int lamps, int onSigns, String onSign) {
		StringBuilder outsign = new StringBuilder();
		for (int i = 0; i < onSigns; i++) {
			outsign.append(onSign);
		}
		for (int j = 0; j < (lamps - onSigns); j++) {
			outsign.append("O");
		}
		return outsign.toString();
	}

	private int[] getTimeExtract(String berlinTime) {
		return Arrays.asList(berlinTime.split(":")).stream().mapToInt(Integer::parseInt).toArray();
	}

	public String getBottomHours(String berlinTime) {
		StringBuilder outBottomHours = new StringBuilder();
		int[] berlinTimeExtract = getTimeExtract(berlinTime);
		int onSigns = berlinTimeExtract[0] % 5;
		outBottomHours.append(getOnOff(4, onSigns, "R"));
		return outBottomHours.toString();
	}

	public String getTopHours(String berlinTime) {
		StringBuilder outTopHours = new StringBuilder();
		int[] berlinTimeExtract = getTimeExtract(berlinTime);
		int onSigns = (berlinTimeExtract[0] - (berlinTimeExtract[0] % 5)) / 5;
		outTopHours.append(getOnOff(4, onSigns, "R"));
		return outTopHours.toString();
	}

	public String getSeconds(String berlinTime) {
		int[] berlinTimeExtract = getTimeExtract(berlinTime);
		int onOffSigns = berlinTimeExtract[2] % 2;
		return onOffSigns == 0 ? "Y" : "O";
	}

}