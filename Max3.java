package com.infinite.day1;

public class Max3 {

	public void check(int a,int b,int c){
	if(a >b&& a>c){
		System.out.println(" is the max value "+ a );
	}else if(b >a&& b>c){
		System.out.println(" is the max value " +b);	
	}else{
		System.out.println(" is the max value " +c );
	}		
	}
	public static void main(String[] args) {
		int a,b,c;
		 a=3;
		 b=7;
		 c=5;
		 Max3 obj = new Max3();
				 obj.check(a, b, c);
	}
}
