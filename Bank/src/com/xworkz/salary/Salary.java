package com.xworkz.salary;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class Salary {

	@NonNull private Double netSalary;
    @NonNull private Double grossSalary;
	@Setter private Double existingLoanAmount;
}
