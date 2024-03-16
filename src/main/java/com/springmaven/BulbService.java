package com.springmaven;

public class BulbService {

	// Bulb bulb=new PhilpsBulb();

	private Bulb bulb;

	public BulbService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bulb getBulb() {
		return bulb;
	}

	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}

	public String askForBulb() {
		return bulb.getBulb();

	}

	@Override
	public String toString() {
		return "BulbService [bulb=" + bulb + "]";
	}

	public BulbService(Bulb bulb) {
		super();
		this.bulb = bulb;
	}

}
