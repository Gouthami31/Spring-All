package com.mvn.config_javabased2;

public class address {
     private String city;
     private String state;
     private int pin;
     public address(String city,String state,int pin) {
    	 this.city=city;
    	 this.state=state;
    	 this.pin=pin;
     }
     public address() {
    	 
     }
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	} 
}
