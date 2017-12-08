package com.test.variable;

public class OpertorTest {

	public static void main(String[] args) {

		//단항연산자
		int i=0; //정수는 int를 쓴다
		// ++i, i++
		i++; // ;로 마치면 뒤에붙어있어도 문장이 바로끝나기때문에 1이 더해져서 나온다

		System.out.println("i="+i); // i=1

		i--; // --i, i-- // ;로 마쳤기때문에 1을 빼준다
		System.out.println("i-1="+i); // i-1=0

		//산술연산자
		int x = 10, y = 2; //정수는 int를 쓴다
		char ch = 'A'; // 아스키코드
		ch = 65; //

		int sum = x + y; // 10+2=12
		int sub = x - y; // 10-2=8
		int multi = x * y; // 10*2=20
		float div = x / (y * 1.0f); // 10/2=5 이지만 float는 실수일때 쓰기때문에 5.0(왼쪽이 주체이기때문에 왼쪽에 맞춰야한다)
		int mock = x / y; // 몫은 5
		int namuji = x % y; // 나머지는 0

		int chSumInt = ch + 3; // 문자형 char은 65이고 3을더한 68의 아스키코드는 D
		char chSumInt2 = (char) chSumInt;

		System.out.println("x+y=" + sum); // x+y=12
		System.out.println("x-y=" + sub); // x-y=8
		System.out.println("x*y=" + multi); // x*y=20
		System.out.println("x/y=" + div); // x/y=5.0
		System.out.println("몫:x/y=" + mock); // x/y=5 (위와 다른점은 위는 float값으로 실수형태기 때문에 소수점이 붙는다)
		System.out.println("나머지 : x/y=" + namuji); // x/y=0
		System.out.println("문자형 char + int =" + chSumInt2); // 문자형 char + int = D(아스키코드)

		// Quiz 1)
		// 1234.56789 의 수에 소수점 세째자리에서 반
		// 올림하시오.
		// hint)
		System.out.println((int) 1.452654);
		
		// 풀이
		
		// x=1234.56789
		// x*100=123456.789		
		
		System.out.println((int) 123456.789); // 123456
		
		//123456 + 1
		int A = 123457, B = 100;
		
		float div1 = (float)A / (float)B;
		
		System.out.println("A/B=" + div1);
		// 다른풀이
		float C = 1234.56789f;
		System.out.println(((int) (C * 100f + 0.5f)) / 100f);
		// 모범답안
		float roundNum=1234.56789f;
		roundNum=((int)((roundNum+0.005f)*100f))/100f;
		
		System.out.println("세째자리 반올림 : "+roundNum);
		
		//roundNum=((int)((roundNum+0.005f;)*100f))/100f;
		
		//System.out.println("세째자리 반올림 : "+roundNum);
		
		//roundNum=(int)(roundNum*100f);
		//roundNum/=100f;
		
		
		

		System.out.println("x > y :" + (x > y)); // true 10>2 o
		System.out.println("x >= y :" + (x >= y)); // true 10>=2 o
		System.out.println("x < y :" + (x < y)); // false 10<2 x
		System.out.println("x <= y :" + (x <= y)); // false 10<=2 x
		System.out.println("x == y :" + (x == y)); // false 10=2 x
		System.out.println("x != y :" + (x != y)); // true 10!=2 o

		// 삼항연산자
		// (조건식) ? A(true) : B(false)
		int kor = 92; // 국어점수 92점

		System.out.println("국어점수 레벨 :" + ((kor >= 90) ? "A " : "F")); // 90점보다 같거나 크면 A이기때문에 92점으로 A

		// 논리연산자
		int k = 9; //정수는 int를 쓴다
		int l = 10; //정수는 int를 쓴다

		System.out.println(k >= 9 && (l = 11) > 10); // true (k>=9는 false기때문에 뒤에식에서 한번더 확인을하여 l이 10이 아닌 11값이 출력된다.)
		System.out.println(l); // l=11
		
		l = 10;

		System.out.println(k > 9 || (l = 11) > 10); // true (이번에도 k>9가 성립되지않기때문에 뒤에서 확인을 해여 l=11 > 10 이 참이기에 11값이 출력)
		System.out.println(l); // l=11
		
		// 대입연산자

		int m = 0; // m은 0
		m = m + 1; // m = 0 + 1; m = 1
		m = m + 1; // m = 1 + 1; m = 2
		m = m + 1; // m = 2 + 1; m = 3
		m = m + 1; // m = 3 + 1; m = 4 (m은 처음에 0이지만 계속해서 1씩 더해져서 값이 1씩 늘어난다)
		System.out.println("m=m+1 : " + m); // m의 값이 1씩 4번 늘어났으므로 값은 4가된다
		
		
	}

}
