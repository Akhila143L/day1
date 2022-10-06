package com.infinite.day1;

public class CaseEx {
	public void show(int n){
		switch(n){
		case 1:
			System.out.println("Hi i am Usha...");
			break;
		case 2:
			System.out.println("Hi i am Likhitha...");
			break;
		case 3:
			System.out.println("Hi i am Shivani...");
			break;
		case 4:
			System.out.println("Hi i am Cherry...");
			break;
		case 5:
			System.out.println("Hi i am Chinni...");
			break;
			default:
				System.out.println("Inavalid choice...");
		}
	}
	public static void main(String[] args) {
		int n=4;
		CaseEx obj = new CaseEx();
		obj.show(n);
		
	}
}
