package com.day8.assignment6.Rules;

import com.day8.assignment6.Exceptions.LicenceExpireException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;  

public class TestRulesLicence{
	
	public static final String EXPIRY_DATE = "2025-10-1";
	
	public static void validateLicence(String date) 
			throws LicenceExpireException, ParseException {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date expiryDate = sdf.parse(EXPIRY_DATE);
			Date currdate = sdf.parse(date);
			
			if(expiryDate.compareTo(currdate) > 0) {
				throw new LicenceExpireException(date + " Licence Valid...");
			}
			else if(expiryDate.compareTo(currdate) < 0) {
				throw new LicenceExpireException(date + " Licence Expired!!!");
			}
			else {
				throw new LicenceExpireException(date + " And " + EXPIRY_DATE + " is Same renew fast!");
			}
			
	}

}
