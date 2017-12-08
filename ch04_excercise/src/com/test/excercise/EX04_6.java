package com.test.excercise;

public class EX04_6 {

	public static void main(String[] args) {
		// 구구단이랑 똑같은 로직
		
		
		for(int num1=1;num1<7;num1++){
			for(int num2=1;num2<7;num2++){
				if(num1+num2==6){
					System.out.println("("+num1+","+num2+")");
				}
				
				
			}
		}
	}

}
//int sum=6;
//for(int num1=1;num1<7;num1++){
//if(sum-num1>0){
//System.out.println("("+num1+","+num2+")");