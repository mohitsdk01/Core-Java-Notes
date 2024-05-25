package com.day8.assignment6.Enum;

public enum FuelEnum {
	Petrol,CNG,EV;
	
	@Override
	public String toString() {
		return name();
	}
}
