package com.test.variable;

import java.util.Scanner;

public class updown {

	public static void main(String[] args) {
		
		//���ٿ�
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		do{
			System.out.print("1�� 100������ ���� �Է��ϼ���.");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�ٿ�!");
			} else if(input < answer) {
				System.out.println("��");
			}			
		} while(input!=answer);
		
		System.out.println("�����Դϴ�.");
		
		

	}

}
