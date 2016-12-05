package com.droid;

public class CityBean {
	public String name;
	public String pinyi;

	public CityBean(String name, String pinyi) {
		super();
		this.name = name;
		this.pinyi = pinyi;
	}

	public CityBean() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPinyi() {
		return pinyi;
	}

	public void setPinyi(String pinyi) {
		this.pinyi = pinyi;
	}

}
