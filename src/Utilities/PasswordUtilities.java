package Utilities;

import java.security.SecureRandom;

public class PasswordUtilities {
	
	public static String KeyGenerator(int size, boolean upper, boolean lower, boolean number, boolean symbol) {
		 String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		 String numbersCase = "0123456789";
		 String symbolsCase = "!@#$%^&*_=+-/";
		 String allCases = upperCaseLetters + lowerCaseLetters + numbersCase + symbolsCase;
		 
		 StringBuilder password = new StringBuilder();
		 
		 
		 if (upper) {
			 password.append(getRandomChar(upperCaseLetters));
		 }
		 if (lower) {
			 password.append(getRandomChar(lowerCaseLetters));
		 }
		 if (number) {
			 password.append(getRandomChar(numbersCase));
		 }
		 if (symbol) {
			 password.append(getRandomChar(symbolsCase));
		 }
		 for (int i = 4; i < size; i++) {
			 password.append(getRandomChar(allCases));
		 }

		return suffleString(password.toString());
	}
	private static char getRandomChar(String Char) {
		SecureRandom random = new SecureRandom();
		
		int randomIndex = random.nextInt(Char.length());
		return Char.charAt(randomIndex);
	}
	private static String suffleString(String var) {
		SecureRandom random = new SecureRandom();
		char[] characters = var.toCharArray();
		
		for (int i = 0; i < characters.length; i++) {
			int randomNumber = random.nextInt(characters.length);
			char temp = characters[i];
			characters[i] = characters[randomNumber];
			characters[randomNumber] = temp;
		}
		return new String(characters);
	}
}

