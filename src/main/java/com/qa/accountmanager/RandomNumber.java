package com.qa.accountmanager;

import java.util.Random;

//import org.springframework.util.StringUtils;
//import org.apache.commons.lang.StringUtils;

public class RandomNumber {

	static Random randomGenerator = new Random();
	static Random r = new Random();
	static char c = (char)(r.nextInt(3) + 'a');
	
	public static void main(String[] args) {
		System.out.println(get6DigitRandNum());
		System.out.println(get8DigitRandNum());
		System.out.println(get10DigitRandNum());
	}
	
	public static String get6DigitRandNum(){
		int random = randomGenerator.nextInt(999999) + 1;
		String padded = String.format("%06d" , random);
		String concat = c + padded;
		return concat; 
	}
	
	public static String get8DigitRandNum(){
		int random = randomGenerator.nextInt(99999999) + 1;
		String padded = String.format("%08d" , random);
		String concat = c + padded;
		return concat; 
	}
	
	public static String get10DigitRandNum(){
		long random = randomGenerator.nextInt((int) 9999999999L) + 1;
		String padded = String.format("%010d" , random);
		String concat = c + padded;
		return concat; 
		
	}
}
