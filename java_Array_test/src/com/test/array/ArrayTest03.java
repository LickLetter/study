package com.test.array;

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		String[][] studentArray=new String[3][4];
		Scanner scan=new Scanner(System.in);
		//�Է�
		for(int num=1;num<studentArray.length+1;num++){
			System.out.println(num+"�� �л�");
			System.out.print("�̸� : ");
			studentArray[num-1][0]=scan.nextLine();
			
			System.out.print("���� : ");
			studentArray[num-1][1]=scan.nextLine();
			
			System.out.print("���� : ");
			studentArray[num-1][2]=scan.nextLine();
			
			System.out.print("���� : ");
			studentArray[num-1][3]=scan.nextLine();
		}

		//���
		int total=0;
		for(int num=1;num<studentArray.length+1;num++){
			total=Integer.parseInt(studentArray[num-1][1])
					+Integer.parseInt(studentArray[num-1][2])
					+Integer.parseInt(studentArray[num-1][3]);
			System.out.println(num+"�� "+studentArray[num-1][0]
			                 +" ��� : "+(total*1f/(studentArray[num-1].length-1)));
		}
	}

}
