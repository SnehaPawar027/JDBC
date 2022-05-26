package com.xworkz.headset.bean;

/*Headset---> brand,cost,warranty,color
Write 8 constrcutors
Declare headSet bean by using all 8 constrcutors 
get reference of all 8 headSet from spring and print the values using getter
 * 
 * 
 * 
 */
public class HeadSet {

	private String brand;
	private String color;
	private boolean HDSound;
	private int price;
	private String quality;
	private String material;
	private String connectivityTechnologies;
	private String formFactor;

	public HeadSet() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	public HeadSet(String brand) {
		this.brand = brand;
	}

	public HeadSet(String color, boolean HDSound) {
		this.color = color;
		this.HDSound = HDSound;
	}

	public HeadSet(boolean HDSound, int price) {
		this.HDSound = HDSound;
		this.price = price;
	}

	public HeadSet(String quality, String material) {
		this.quality = quality;
		this.material = material;

	}

	public HeadSet(String material, String connectivityTechnologies, String formFactor) {
		this.material = material;
		this.connectivityTechnologies = connectivityTechnologies;
		this.formFactor = formFactor;

	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public boolean getHDSound() {
		return HDSound;
	}

	public int getPrice() {
		return price;
	}

	public String isQuality() {
		return quality;
	}

	public String getMaterial() {
		return material;
	}

	public String getConnectivityTechnologies() {
		return connectivityTechnologies;
	}

	public String getFormFactor() {
		return formFactor;
	}

}
