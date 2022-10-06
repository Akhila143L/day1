package com.infinite.day1;

public class CtoR {

	public void calc(double c){
     double r=(4*c)/5;
     System.out.println("Radius value "+r);
	}
	public static void main(String[] args) {
		double c=35;
		CtoR obj = new CtoR();
		obj.calc(c);	
		
	}
}
