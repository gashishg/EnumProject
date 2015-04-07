package com.practice;

public class Customer {
	
}

enum Animal {
	SRD(100, "SRD"), PRD(200, "JNW");
	
	String value;
	int size;
	
	private Animal(int size, String value) {
		this.size = size;
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public int getSize() {
		return this.size;
	}
}
