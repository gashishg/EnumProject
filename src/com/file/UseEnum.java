/**
 * 
 */
package com.file;

/**
 * @author Ashish.Gupta
 *
 */
enum Enum {	
	
	CUSTOMER(10, "customer"), ITEM(20, "item");
	
	private int size;
	private String name;
	
	Enum(int size, String name) {
		this.size = size;
		this.name = name;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("CUSTOMER SIZE-"+CUSTOMER.size);
		return str.toString();
	}
	
};


/**
 * 
 * @author Ashish.Gupta
 *
 */
public class UseEnum {
	
	private enum Property{FirstName, LastName, ADDRESS}	
	
	public static void main(String[] args) {
		
		Enum[] eConstants = Enum.values();
		System.out.println(Enum.CUSTOMER.toString());
		System.out.println(Enum.CUSTOMER.getSize());
		System.out.println(Property.FirstName);
		for(Enum eConst: eConstants) {
			System.out.println(eConst+"----"+eConst.getSize());
			System.out.println(eConst+"----"+eConst.getName());
		}
		
	}
	
}
