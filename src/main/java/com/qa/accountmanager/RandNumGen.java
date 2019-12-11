package com.qa.accountmanager;

import java.util.Random;

public class RandNumGen {
	
	Random rand = new Random();
	
	public String get6Dig() {
		String num = "rand.nextInt(9)" + "rand.nextInt(9)" + "rand.nextInt(9)" + "rand.nextInt(9)" + "rand.nextInt(9)" + "rand.nextInt(9)";
	
		return num;
	}

}
