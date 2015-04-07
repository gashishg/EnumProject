package com.practice;

public class Customer1 {
	
}

enum Property {
	SRD(100, "abc"), PRD(200, "JNW");
	
	String value;
	int size;
	
	private Property(int size, String value) {
		this.value = value;
		this.size = size;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public int getSize() {
		return this.size;
	}
}
