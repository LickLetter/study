package com.test.excercise;

public class EX04_2 {

	public static void main(String[] args) {

		// 4-2.  1���� 20������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ����
		int sum=0;

		for(int num=1; num<21; num++){
			if(num % 2 != 0 && num % 3 !=0){sum+=num;} // sum = sum+ num;
				}
		System.out.println("sum="+sum);
	}

}
