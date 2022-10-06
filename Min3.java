package com.infinite.day1;

public class Min3 {

	public void check(int a,int b,int c){
		if(a<b && a<c){
			System.out.println("minimum value  is "+a);
		}
		else if(b<c && b< a){
			System.out.println(" minimum value is "+b);
		}
		else{
			System.out.println(" minimum value is "+c);
		}
	}
	public static void main(String[] args) {
		int a,b,c;
		a=4;
		b=8;
		c=6;
		Min3 obj = new Min3();
		obj.check(a, b, c);
		
	}
}
