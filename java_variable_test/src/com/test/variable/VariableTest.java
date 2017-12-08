package com.test.variable;

import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int kor; // 국어점수 90점
		int eng; // 영어점수 80점
		int math; // 수학점수 100점
		
		
		//String answer="";
		

		// Quiz 3)
		// 입력되는 값은 0~100사이의 정수만 가능;
		// '계속하시겠습니다?(y/n)' 메세지를 출력하고
		// 'n' 일때까지 반복.
		// 숫자형 판단 , 0~100숫자
		/*String scoreStr="";
		boolean isNumber = false;
		
		while(!answer.equals("n")){
			int score;
			while(!isNumber)*/
		}
		

		System.out.print("국어점수 : ");
		kor = Integer.parseInt(scan.nextLine()); // kor=scan.nextLine(); 인트형와
													// 문자열이 달라서 뒤는 문자열인데 앞은
													// 인트형이라 오류남
		System.out.print("영어점수 : ");
		eng = Integer.parseInt(scan.nextLine());
		System.out.print("수학점수 : ");
		math = Integer.parseInt(scan.nextLine());

		int total = kor + eng + math; // 총점 90+80+100 = 270

		float avg = total / 3;

		// 총점 나누기 과목수를 하면 평균점수이므로 270/3 = 90점
		// 평균점수 float을 쓴건 지금은 과목수가 적지만 많을때는 버리는수가 너무 크기때문에 소수점을 챙기기위해 float을 씀

		System.out.println("총점 : " + total); // 총점 270점
		System.out.println("평균 : " + avg); // 평균 90.0

		// Quiz 2)
		// 평균이 90이상 : A
		// 평균이 80이상 : B
		// 평균이 80미만 : F
		// 를 출력하시오.

		char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F'); // 문자형이 아니라
																	// 캐릭터형
		System.out.println("학점 : " + grade);

		String gradeIf = "";
		if (avg >= 90) {
			gradeIf = "A";
			if (avg >= 95) {
				gradeIf = gradeIf + "+";
			}
		} else if (avg >= 80) {
			gradeIf = "B";
			if (avg >= 85) {
				gradeIf = gradeIf + "+";
			}
		} else {
			gradeIf = "F";
		}

		System.out.println("학점 : " + gradeIf);

		int avg1 = 85; // 평균 점수

		System.out.println("평균 점수 : " + ((avg1 >= 90) ? "A " : ((avg1 >= 80) ? "B" : "F")));

		// 90보다 크거나같으면 A, 90보다 작고 80보다 크거나같으면 B, 80보다 작으면 F

	}

}
