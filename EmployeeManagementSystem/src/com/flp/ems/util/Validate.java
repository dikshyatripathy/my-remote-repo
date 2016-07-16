package com.flp.ems.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate 
{
	//name
	public static boolean validateLetters(String txt) 
	{

	    String regx = "[a-zA-Z]+\\.?";
	    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(txt);
	    return matcher.find();
	}
	//phone number
	public static boolean Phonenumber(String argv) 
	{ 
		         String phoneNumber = "1-(80..2)-321-0361"; 
		         System.out.println(phoneNumber.length()); 
		         String regex = "^\\+?[0-9. ()-]{10,25}$"; 
		         Pattern pattern = Pattern.compile(regex); 
		         Matcher matcher = pattern.matcher(phoneNumber); 
		 
		 
		         if (matcher.matches()) { 
		             System.out.println("Phone Number Valid");
		             return true;
		         } else { 
		             System.out.println("Phone Number must be in the form XXX-XXXXXXX"); 
		             return false;
		         } 
	}
	//email address
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		public static boolean validate(String emailStr) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
		        return matcher.find();
		}
	//date of birth and date of joining
		public static boolean isValid(String text) {
		    if (text == null || !text.matches("\\d{4}-[01]\\d-[0-3]\\d"))
		        return false;
		    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		    df.setLenient(false);
		    try {
		        df.parse(text);
		        return true;
		    } catch (ParseException ex) {
		        return false;
		    }
		}
		
		
}
