package com.test.variable;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		// Quiz 3)
		// �ԷµǴ� ���� 0~100������ ������ ����;
		// '����Ͻðڽ��ϴ�?(y/n)' �޼����� ����ϰ�
		// 'n' �϶����� �ݺ�.
		
		int num = 0;
		
		System.out.print("0~100������ �� : ");
		num = Integer.parseInt(scan.nextLine());
		
		
		while(!scan.nextLine().equals("n")){
        	System.out.println("n�� ������������ �ݺ��մϴ�.");
        	
			
		}

	}

}
