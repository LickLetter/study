package com.test.array;

import java.util.Scanner;

public class ArrayTest02 {  // 마우스 커서를 올리면 파일명을 바꿀수있다

	public static void main(String[] args) {
		
		String[] idArray=new String[100];
		String[] pwdArray=new String[100];
		
		idArray[0]= pwdArray[0] = "mimi";
		
		String inputID="";
		String inputPWD="";
		
		int currentIndex=3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** 도서 관리 프로그램 ***");
		System.out.println("[1]로그인");
		System.out.println("[2]회원가입");
		System.out.println("[3]아디/패스워드찾기");
		System.out.println("[4]종료");
		System.out.print("메뉴를 선택하세요._");
		
		String menu = scan.nextLine();
		String msg="";
		switch (menu) {
		case "1":
			msg="로그인 선택하셨습니다.";
			System.out.print("아이디 : ");
			inputID=scan.nextLine();
			int findIndex=-1;
			for(int index=0;index<currentIndex;index++){
				if(inputID.equals(idArray[index])){
					findIndex=index;
					break;
				}
			}
		if(findIndex > -1){
			System.out.print("패스워드 : ");
			inputPWD=scan.nextLine();
			if(inputPWD.equals(pwdArray[index])){
				System.out.print("로그인에 성공하셨습니다.\n");
			}else{   //패스워드 불일치
				System.out.print("패스워드가 일치하지않습니다.");
			}
		}else{ //존재하지 않는 아이디
			System.out.print("아이디가 존재하지 않습니다.");
		}
			break;
		case "2":
			msg="회원가입을 선택하셨습니다.";
			break;
		case "3":
			msg="아이디/패스워드 찾기를 선택하셨습니다.";
			break;
		case "4":
			msg="프로그램을 종료합니다..";
			System.out.println(msg);
			return ;
		default:
			msg="메뉴 선택이 올바르지 않습니다.";
		}
		System.out.println(msg);

	}

}
