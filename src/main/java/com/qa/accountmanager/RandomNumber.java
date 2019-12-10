package com.qa.accountmanager;

import java.util.Random;

public class RandomNumber {
	
	Random randomGenerator = new Random();
	char c = (char)(randomGenerator.nextInt(3) + 'a');
	
	public String randNumGen() {
		int n = randomGenerator.nextInt(3);
		switch(n) {
		case(0):
			return get6DigitRandNum();
		case(1):
			return get8DigitRandNum();
		case(2):
			return get10DigitRandNum();
		default:
			return null;
		}
	}
	
	public String get6DigitRandNum(){
		int random = randomGenerator.nextInt(999999) + 1;
		String concat = c + String.format("%06d" , random);
		return concat; 
	}
	
	public String get8DigitRandNum(){
		int random = randomGenerator.nextInt(99999999) + 1;
		String concat = c + String.format("%08d" , random);
		return concat; 
	}
	
	public String get10DigitRandNum(){
		long random = randomGenerator.nextInt((int) 9999999999L) + 1;
		String concat = c + String.format("%010d" , random);
		return concat; 
	}
}
