package com.fdservice.service;

public class Fdservice {
	/*public float FD(float p,float t,float r)
	{float i= (float) ((p*t*r)/100.0);
	return (p+i);}*/
	
	public double calculateFD(double amount,int noOfDays,int ageOfACHolder ) {
		double rateOfInterest = 0;
		double interest= 0;
		
		if (amount < 100000) {
			if (noOfDays >= 7 && noOfDays <= 14) {
				rateOfInterest = 4.5;
			} else if (noOfDays > 15 && noOfDays <= 29) {
				rateOfInterest = 4.75;
			} else if (noOfDays >= 30 && noOfDays <= 45) {
				rateOfInterest = 5.5;
			} else if (noOfDays >= 46 && noOfDays <= 60) {
				rateOfInterest = 7;
			} else if (noOfDays >= 61 && noOfDays <= 184) {
				rateOfInterest = 7.5;
			} else if (noOfDays >= 185 && noOfDays <= 365) {
				rateOfInterest = 8;
			}
			if (ageOfACHolder >= 65) rateOfInterest += 0.5;
			} 
		else {
			if (noOfDays >= 7 && noOfDays <= 14) {
				rateOfInterest = 6.5;
			} else if (noOfDays >= 15 && noOfDays <= 29) {
				rateOfInterest = 6.75;
			} else if (noOfDays >= 30 && noOfDays <= 45) {
				rateOfInterest = 6.75;
			} else if (noOfDays >= 46 && noOfDays <= 60) {
				rateOfInterest = 8;
			} else if (noOfDays >= 61 && noOfDays <= 184) {
				rateOfInterest = 8.5;
			} else if (noOfDays >= 185 && noOfDays <= 365) {
				rateOfInterest = 10;
			}
		}
		
		interest = amount * rateOfInterest / 100;
		
		return (amount+interest);}
	

}
