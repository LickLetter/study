package com.test.array;

import java.util.Scanner;

public class ArrayTest02 {  // ���콺 Ŀ���� �ø��� ���ϸ��� �ٲܼ��ִ�

	public static void main(String[] args) {
		
		String[] idArray=new String[100];
		String[] pwdArray=new String[100];
		
		idArray[0]= pwdArray[0] = "mimi";
		
		String inputID="";
		String inputPWD="";
		
		int currentIndex=3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** ���� ���� ���α׷� ***");
		System.out.println("[1]�α���");
		System.out.println("[2]ȸ������");
		System.out.println("[3]�Ƶ�/�н�����ã��");
		System.out.println("[4]����");
		System.out.print("�޴��� �����ϼ���._");
		
		String menu = scan.nextLine();
		String msg="";
		switch (menu) {
		case "1":
			msg="�α��� �����ϼ̽��ϴ�.";
			System.out.print("���̵� : ");
			inputID=scan.nextLine();
			int findIndex=-1;
			for(int index=0;index<currentIndex;index++){
				if(inputID.equals(idArray[index])){
					findIndex=index;
					break;
				}
			}
		if(findIndex > -1){
			System.out.print("�н����� : ");
			inputPWD=scan.nextLine();
			if(inputPWD.equals(pwdArray[index])){
				System.out.print("�α��ο� �����ϼ̽��ϴ�.\n");
			}else{   //�н����� ����ġ
				System.out.print("�н����尡 ��ġ�����ʽ��ϴ�.");
			}
		}else{ //�������� �ʴ� ���̵�
			System.out.print("���̵� �������� �ʽ��ϴ�.");
		}
			break;
		case "2":
			msg="ȸ�������� �����ϼ̽��ϴ�.";
			break;
		case "3":
			msg="���̵�/�н����� ã�⸦ �����ϼ̽��ϴ�.";
			break;
		case "4":
			msg="���α׷��� �����մϴ�..";
			System.out.println(msg);
			return ;
		default:
			msg="�޴� ������ �ùٸ��� �ʽ��ϴ�.";
		}
		System.out.println(msg);

	}

}
