package com.test.variable;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		// Quiz 3)
		// 입력되는 값은 0~100사이의 정수만 가능;
		// '계속하시겠습니다?(y/n)' 메세지를 출력하고
		// 'n' 일때까지 반복.
		
		int num = 0;
		
		System.out.print("0~100까지의 수 : ");
		num = Integer.parseInt(scan.nextLine());
		
		
		while(!scan.nextLine().equals("n")){
        	System.out.println("n을 누르기전까지 반복합니다.");
        	
			
		}

	}

}
