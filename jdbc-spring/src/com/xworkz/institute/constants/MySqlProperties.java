package com.xworkz.institute.constants;

public enum MySqlProperties {
	
	URL("jdbc:mysql://localhost:3306/Athlete"), USERNAME("root"), PASSWORD("9606368947");

	private String val;

	private MySqlProperties(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}

}
