package com.test.array;

public class ArrayTest01 {
	int x=30;  //�޸� ������ �ٸ�
	
	
	{
		int x=10000000;
		//int x;
		System.out.println(x); // �������� ã�⶧���� 10000000�� ���´� int x=10000000;�� ������ ������ ���� 30�� ã�´� (ex������)
		{
			//int x;
			int y;
			{
				//int x;  ������ �Ʒ��� ���ʿ��� ���������� �켱����
			}			
		}
			
		{
			int y;
				
		}
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {

		int[] intArray=new int[5]; // Ÿ��[] �迭�̸� = new Ÿ��[����];
		intArray[0]=1; // �迭 intArray�� 1��° ��ҿ� 1�� ����
		intArray[1]=2; // �迭 intArray�� 2��° ��ҿ� 2�� ����
		intArray[2]=3; // �迭 intArray�� 3��° ��ҿ� 3�� ����
		intArray[3]=4; // �迭 intArray�� 4��° ��ҿ� 4�� ����
		intArray[4]=5; // �迭 intArray�� 5��° ��ҿ� 5�� ����
		
		// 1���� �迭 (��)
		int[] intArray2={1,2,3,4,5}; //�����Ͱ� ������
		
		int[] intArray3=new int[]{1,2,3,4,5}; // ���ο� �迭�� �Ҵ��Ҷ�
		
		intArray=new int[]{1,2,3,4,5,6,7,8,9,10}; // new int �� '������'�Ҷ�
		
		int[] intArray4=new int[100]; // �ε����� 0������ 99������
		
		for(int index=0;index<intArray4.length;index++){
			intArray4[index]=index+1;
		} 
		// �Ʒ��� ���� �����Ų���� ���� ���̴�
		/*for(int index=0;index<intArray4.length;index++){
			System.out.print(intArray4[index]);
			if(intArray4[index]%10!=0){
				System.out.print(",");
			}else{
				System.out.println(); }}*/
		
		for(int index=0;index<intArray4.length;index++){
			System.out.print(intArray4[index]+(intArray4[index]%10!=0?",":"\n"));
		}
		
		// 2���� �迭 (�� x ��) -> �迭 �ȿ� �迭
		int[][] intArrays=new int[3][3]; // 3�� 3��
		
		int[][] intArrays2={
				             {1, 2, 3},
				             {4, 5, 6},
				             {7, 8, 9}
						};  //�迭 �ȿ� �迭�� ������
		int[][] scoreTable2=new int[5][3];
		
		int[][] scoreTable={
				
				             {100,100,100},
				             { 20, 20, 20},
				             { 30, 30, 30},
				             { 40, 40, 40}, //��� 40�� scoreTable[3][1]      (3,1) 
				             { 50, 50, 50}
				        };
		int total=0;
		for(int row=0; row<scoreTable.length; row++){
			total=0; //�ѹ� �ʱ�ȭ ������Ѵ�
			for(int col=0;col<scoreTable[row].length;col++){
				total+=scoreTable[row][col]; //col ��
			}
			System.out.println((row+1)+"�� �л� ��� : " + (total*1f/scoreTable[row].length));
		}
		
		int korTotal=0;     // for(int col=0;col<scoreTable[row].length;col++)
		int engTotal=0;
		int mathTotal=0;
		for(int row=0;row<scoreTable.length;row++){  //�׻� row�� ���� �����ؾ���
			korTotal+=scoreTable[row][0]; // ���������� ������ 1��° ���� ����
			engTotal+=scoreTable[row][1]; // ���������� ������ 2��° ��  ����
			mathTotal+=scoreTable[row][2]; // ���������� ������ 3��° �� ����
		}
		System.out.println("��ü �л��� ������� : "+korTotal/3f); // ������ ������� ������ ����� ���
		System.out.println("��ü �л��� ������� : "+engTotal/3f); // �Ҽ����� ������ �ʱ����ؼ� �׳� 3�� �������ʰ� 3f�� float������ ����
		System.out.println("��ü �л��� ������� : "+mathTotal/3f);

	}

}
