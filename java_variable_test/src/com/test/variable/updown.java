package com.test.variable;

import java.util.Scanner;

public class updown {

	public static void main(String[] args) {
		
		//업다운
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		do{
			System.out.print("1과 100사이의 수를 입력하세요.");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("다운!");
			} else if(input < answer) {
				System.out.println("업");
			}			
		} while(input!=answer);
		
		System.out.println("정답입니다.");
		
		

	}

}
