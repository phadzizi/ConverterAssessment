package com.assessment.converters;

public class Converter {
	public static double kelvinToCelsius(double value) {
		return value - 273.15;
	}

	public static double poundsToKilograms(double value) {
		return value / 2.205;
	}

	public static double milesToKilometers(double value) {
		return value * 1.609;
	}
}