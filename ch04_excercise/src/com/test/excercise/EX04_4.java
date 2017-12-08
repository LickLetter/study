package com.test.excercise;

public class EX04_4 {

	public static void main(String[] args) {


		// 4-4 while문 삼항연산자
		
		int num=0;
		int sum=0;
		
		while(sum<=100){ // (!(sum>=100))
			num++;
			if(num%2==0){
				sum-=num;
			}else{
				sum+=num;
			}
		}
		System.out.println("num="+num);
		System.out.println("sum="+sum);


	}

}
