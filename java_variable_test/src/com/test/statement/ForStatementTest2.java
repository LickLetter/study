package com.test.statement;

public class ForStatementTest2 {

	public static void main(String[] args) {
		
		
		
		//1~10사이의 짝수를 더하시오.
		System.out.println("1~10사이의 짝수를 더하시오.");
		int sum=0;
		for(int i=1;i<11;i++){
			if(i%2==0){
				System.out.println("더해진 정수는 :"+i);
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
		//2단 구구단을 작성하시오.
		System.out.println("2단 구구단을 작성하시오.");
		int dan=2;
		for(int gop=1;gop<10;gop++){
			System.out.println(dan+"*"+gop+"="+dan*gop);
		}
		
		//구구단
		for(int dann=2;dann<10;dann++){
			System.out.println(dann+"단입니다.");
			for(int gopp=1;gopp<10;gopp++){
				System.out.println(dann+"*"+gopp+"="+dann*gopp);
			}
			System.out.println();			
		
		}
		
		for(int ar=1;ar<11;ar++){
			for(int st=1;st<=ar;st++){
				System.out.print("*");
			}
			System.out.println();
		}
		
			

	}

}
