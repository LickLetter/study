package com.test.excercise;

public class EX04_9 {

	public static void main(String[] args) {
		
		String str = "12345";
		int sum = 0;
		for(int i=0; 1 < str.length(); i++){
			sum=sum+Integer.parseInt(""+str.charAt(i));
		}
		System.out.println("sum="+sum);

	}

}
