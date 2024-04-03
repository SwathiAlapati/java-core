package com.learning.core.day1session1;

interface MedicineInfo{
	void displayLabel();
}

class Tablet implements MedicineInfo{
	public void displayLabel() {
		System.out.println("Store Tablets in a cool dry place.");
	}
}
class Syrup implements MedicineInfo{
	public void displayLabel() {
		System.out.println("Syrup is consumable only on prescription.");
	}
}
class Ointment implements MedicineInfo{
	public void displayLabel() {
		System.out.println("Ointment is for external use only.");
	}
}
//class to test the polymorphic behavior
public class D01P02 { 
	public static void main(String[] args) {
		MedicineInfo m1=new Tablet();
		m1.displayLabel();
		
		MedicineInfo m2=new Syrup();
		m2.displayLabel();
		
		MedicineInfo m3=new Ointment();
		m3.displayLabel();
	}

}
