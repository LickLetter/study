package com.test.array;

public class ArrayTest01 {
	int x=30;  //메모리 영역이 다름
	
	
	{
		int x=10000000;
		//int x;
		System.out.println(x); // 가까운데부터 찾기때문에 10000000이 나온다 int x=10000000;가 없으면 밖으로 나가 30을 찾는다 (ex취조실)
		{
			//int x;
			int y;
			{
				//int x;  위에서 아래로 왼쪽에서 오른쪽으로 우선순위
			}			
		}
			
		{
			int y;
				
		}
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {

		int[] intArray=new int[5]; // 타입[] 배열이름 = new 타입[길이];
		intArray[0]=1; // 배열 intArray의 1번째 요소에 1을 저장
		intArray[1]=2; // 배열 intArray의 2번째 요소에 2을 저장
		intArray[2]=3; // 배열 intArray의 3번째 요소에 3을 저장
		intArray[3]=4; // 배열 intArray의 4번째 요소에 4을 저장
		intArray[4]=5; // 배열 intArray의 5번째 요소에 5을 저장
		
		// 1차원 배열 (행)
		int[] intArray2={1,2,3,4,5}; //데이터가 적을때
		
		int[] intArray3=new int[]{1,2,3,4,5}; // 새로운 배열을 할당할때
		
		intArray=new int[]{1,2,3,4,5,6,7,8,9,10}; // new int 는 '재정의'할때
		
		int[] intArray4=new int[100]; // 인덱스는 0번부터 99번까지
		
		for(int index=0;index<intArray4.length;index++){
			intArray4[index]=index+1;
		} 
		// 아래의 식을 압축시킨것이 위의 식이다
		/*for(int index=0;index<intArray4.length;index++){
			System.out.print(intArray4[index]);
			if(intArray4[index]%10!=0){
				System.out.print(",");
			}else{
				System.out.println(); }}*/
		
		for(int index=0;index<intArray4.length;index++){
			System.out.print(intArray4[index]+(intArray4[index]%10!=0?",":"\n"));
		}
		
		// 2차원 배열 (행 x 열) -> 배열 안에 배열
		int[][] intArrays=new int[3][3]; // 3행 3열
		
		int[][] intArrays2={
				             {1, 2, 3},
				             {4, 5, 6},
				             {7, 8, 9}
						};  //배열 안에 배열이 들어가있음
		int[][] scoreTable2=new int[5][3];
		
		int[][] scoreTable={
				
				             {100,100,100},
				             { 20, 20, 20},
				             { 30, 30, 30},
				             { 40, 40, 40}, //가운데 40은 scoreTable[3][1]      (3,1) 
				             { 50, 50, 50}
				        };
		int total=0;
		for(int row=0; row<scoreTable.length; row++){
			total=0; //한번 초기화 해줘야한다
			for(int col=0;col<scoreTable[row].length;col++){
				total+=scoreTable[row][col]; //col 열
			}
			System.out.println((row+1)+"번 학생 평균 : " + (total*1f/scoreTable[row].length));
		}
		
		int korTotal=0;     // for(int col=0;col<scoreTable[row].length;col++)
		int engTotal=0;
		int mathTotal=0;
		for(int row=0;row<scoreTable.length;row++){  //항상 row로 먼저 시작해야함
			korTotal+=scoreTable[row][0]; // 국어점수의 총합은 1번째 행의 총합
			engTotal+=scoreTable[row][1]; // 영어점수의 총합은 2번째 행  총합
			mathTotal+=scoreTable[row][2]; // 수학점수의 총합은 3번째 행 총합
		}
		System.out.println("전체 학생의 국어평균 : "+korTotal/3f); // 총점을 과목수로 나누어 평균을 계산
		System.out.println("전체 학생의 영어평균 : "+engTotal/3f); // 소수점을 버리지 않기위해서 그냥 3을 나누지않고 3f로 float형으로 만듬
		System.out.println("전체 학생의 수학평균 : "+mathTotal/3f);

	}

}
