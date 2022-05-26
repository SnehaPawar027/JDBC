package com.xworkz.athlete.properties;

public enum MySql {

	URL("jdbc:mysql://localhost:3306/Athlete"), USERNAME("root"), PASSWORD("9606368947");

	private String val;

	private MySql(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}

}
