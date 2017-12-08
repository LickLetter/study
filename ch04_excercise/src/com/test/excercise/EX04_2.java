package com.test.excercise;

public class EX04_2 {

	public static void main(String[] args) {

		// 4-2.  1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합
		int sum=0;

		for(int num=1; num<21; num++){
			if(num % 2 != 0 && num % 3 !=0){sum+=num;} // sum = sum+ num;
				}
		System.out.println("sum="+sum);
	}

}
