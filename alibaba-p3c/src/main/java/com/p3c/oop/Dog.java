package com.p3c.oop;

import java.io.Serializable;

public class Dog implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
