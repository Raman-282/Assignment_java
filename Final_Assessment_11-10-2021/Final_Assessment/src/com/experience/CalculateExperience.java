package com.experience;
//3.	Write a java class to calculate your experience (no.of years, no.of months &no.of days) in xyz company by using java time API. Using java 8 data api.
import java.time.*;

public class CalculateExperience {

	public static void main(String args[]) {
		
		LocalDate joiningdate = LocalDate.of(2021, Month.AUGUST, 16);
        LocalDate today = LocalDate.now();
        
        Period age = Period.between(joiningdate, today);
        int years = age.getYears();
        int months = age.getMonths();
        int days=age.getDays();
        
        System.out.println("number of years: " + years);
        System.out.println("number of months: " + months);	
        System.out.println("number of days: " + days);	
        
	}
}
