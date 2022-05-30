package com.xworkz.loan;

import com.xworkz.salary.Salary;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class Loan {
	
	@Setter
	private String provider;
	@NonNull
	private Salary salary; 
	
 public boolean saction() {
	 
	 if(salary!=null) {
		 if(salary.getNetSalary()>1500 && salary.getGrossSalary()>2000 && salary.getExistingLoanAmount()<500) {
			 System.out.println("eligible for loan"); 
			 return true;
		 }else {
			 System.out.println("not eligible");
		 }
	 
	 }
	 
	return false;
	 
 }
}
