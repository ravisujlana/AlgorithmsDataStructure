package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CounterfeitCurrency {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList();
		list.add("SCD203010T");
		list.add("A201550B");
		list.add("ABB19991000Z");
		list.add("XYZ200019Z");
		list.add("ERF200220");
		list.add("SCD203010T");
		countCounterfeit(list);
	}
	//regex for validating string inputs as upper case
	static String regexUpperCase = "^[A-Z]+$";
	//regex for validation numbers inputs for year and currency value
	static String regexNumber = "^[0-9]+$";
	//pre-compile pattern for performance reasons
	static Pattern patternUpperCase = Pattern.compile(regexUpperCase);
	static Pattern patternNumber = Pattern.compile(regexNumber);

	public static int countCounterfeit(List<String> serialNumber) {
	    // Write your code here
		int sumOfvalidCurrecny = 0;
		for(String currency: serialNumber) {
			 sumOfvalidCurrecny += validateCurrency(currency);
			
		}
		return sumOfvalidCurrecny;
	}
	
	/**
	 * validate input for valid currency and return a non-zero value if currency is valid
	 * @param currencyInput
	 * @return 0 if invalid currency and non-zero value if valid currency
	 */
	static int validateCurrency(String currencyInput) {
		int currencyValue = 0;
		int length = currencyInput.length();
		//validate currency length for constraints
		if(length < 10 || length > 12)
			return currencyValue;
		//Split string into 4 buckets, 3 char beginning string, 4 char year, 2-4 char currency value 
		// and last char to validate against constraints
		String beginChars = currencyInput.substring(0,3);
		String yearString = currencyInput.substring(3,7);
		String value = currencyInput.substring(7,length-1);
		String lastChar = currencyInput.substring(length-1);

		//check if valid string and numbers first
		boolean matchUpperCase = matchUpperCase(beginChars);
		
		/*
		 * Check:
		 * 1. if first 3 chars are distinct string 
		 * 	!matchUpperCase 
		 *	|| ( matchUpperCase && !isDistinct(beginChars))
		 *  and second & third values are numbers
		 *  and fourth value is a String.
		 *  if not, return 0 since this is counterfeit currency
		 */
		if(!matchUpperCase 
				|| ( matchUpperCase && !isDistinct(beginChars))
				|| !matchNumber(yearString) 
				|| !matchNumber(value)
				|| !matchUpperCase(lastChar))
			return currencyValue;
		
		int year = Integer.parseInt(yearString);
		
		//validate year range
		if(year < 1900 || year > 2019)
			return currencyValue;
		currencyValue = Integer.parseInt(value);
		
		//Validate currency denomination
		if(currencyValue == 10 
				|| currencyValue == 20 
				|| currencyValue == 50 
				|| currencyValue == 100 
				|| currencyValue == 200 
				|| currencyValue == 500 
				|| currencyValue == 1000 
				)
			return currencyValue;
		return 0;
	}
	/**
	 * Check for duplicate chars in first 3 characters
	 * returns false if any duplicate found
	 */
	static boolean isDistinct(String beginChars) {
		
		char[] charArray = beginChars.toCharArray();
		int[] charCount = new int[255];
		for(char c : charArray) {
			charCount[c] +=1;
			if(charCount[c]> 1)
				return false;
		}
		return true;
	}

	/**
	 * Check if text is only uppercase letters
	 * @param text
	 * @return true if text contains only upper case letters
	 */
	static boolean matchUpperCase(String text) {
		
		Matcher matcher = patternUpperCase.matcher(text);
        //Local variable in case of logging needs
        boolean allUpperCaseAlphabets = matcher.find();
        return allUpperCaseAlphabets;
	}
	
	/** 
	 * Check if a text is number or not
	 * @param text
	 * @return true if text contains only numbers
	 */
	static boolean matchNumber(String text) {
		
        Matcher matcher = patternNumber.matcher(text);
        
        //Local variable in case of logging implementation
        boolean matchNumber = matcher.find();
		
        return matchNumber;
	}
	
	/** 
	 * Check if a text is within defined year range
	 * @param text
	 * @return true if text contains valid year between 1900 and 2019
	 */
	static boolean validateYearRange(String text) {
		
        Pattern pattern = Pattern.compile(yearRange);
        Matcher matcher = pattern.matcher(text);
        
        //Local variable in case of logging implementation
        boolean yearRange = matcher.find();
		
        return yearRange;
	}
	
	/** 
	 * Check if a text is within defined year range
	 * @param text
	 * @return true if text contains valid currency 10,20,50,100,200,500,1000
	 */
	static boolean validateCurrencyRange(String text) {
		
        Pattern pattern = Pattern.compile(currencyValues);
        Matcher matcher = pattern.matcher(text);
        
        //Local variable in case of logging implementation
        boolean currencyValue = matcher.find();
		
        return currencyValue;
	}
}
