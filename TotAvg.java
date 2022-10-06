package com.infinite.day1;

public class TotAvg {

	public void calc(int a,int b,int c,int d,int e){
		int t=a+b+c+d+e;
		int avg=t/5;
		if(a>35 & b>35 & c>35 & d>35 & e>35){
			System.out.println("pass..");
			System.out.println("total " +t);
			System.out.println("Average "+avg);
			}
		else{
     System.out.println("fail..");
     }
	}  
	public static void main(String[] args) {
		int a,b,c,d,e;
		a=20;
		b=76;
		c=87;
		d=75;
		e=85;
		TotAvg obj = new TotAvg();
		obj.calc(a, b, c, d, e);
		
	}
}
