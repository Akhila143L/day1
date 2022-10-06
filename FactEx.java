package com.infinite.day1;

public class FactEx {

	public void calc(int n){
		 int f=1;
		 int i=1;
		 while(i <= n){
			f = f*i;
			i++;
			
		 }
		System.out.println("Factorial value "+f);
	}
	public static void main(String[] args) {
		int n=6;
		FactEx obj = new FactEx();
		obj.calc(n);
	}
}
