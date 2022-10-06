package com.infinite.day1;

public class Cbill {

	public void show(double units){
     double bill;
	double rate;
	if(units <= 90){
		rate=1;
		bill= units*rate;
		System.out.println("bill is " +bill);
	}
	 if(units >90 ){
		rate=1.5;
		bill= units*rate;
		System.out.println("bill is " +bill);
	}
	else if(units >151){
		rate=2;
		bill= units*rate;
		System.out.println("bill is " +bill);
		
	}
	else if(units >201-240){
		rate=2.5;
		bill=units*rate;
		System.out.println("bill is " +bill);
	
	}
	else if( units <241){
		rate=3;
		bill=units*rate;
		System.out.println("bill is " +bill);
		
	}
		
}
	public static void main(String[] args) {
		double units=180;
		Cbill obj = new Cbill();
		obj.show(units);
		
		
}
}