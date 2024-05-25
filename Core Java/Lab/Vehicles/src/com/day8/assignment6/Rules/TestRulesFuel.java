package com.day8.assignment6.Rules;

import com.day8.assignment6.Enum.*;
import com.day8.assignment6.Exceptions.UnSupportedFuelException;

public class TestRulesFuel {
	
	public static void validateFuel(String fuelType) 
			throws UnSupportedFuelException {
		for(FuelEnum e : FuelEnum.values()) {
			if(fuelType.equals(e.toString())) {
				throw new UnSupportedFuelException(fuelType + " is supported...");
			}
			else 
				throw new UnSupportedFuelException(fuelType + " is not Supported!");
		}
		System.out.println("Fill supported fuel.");
	}
	
	public String toString(String str) {
		return str;
		
	}
}
