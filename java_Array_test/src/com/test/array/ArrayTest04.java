package com.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest04 {

	public static void main(String[] args) {
		
		int[] intArray=new int[7];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<intArray.length;i++){
			System.out.print((i+1)+"번째 숫자 : ");
			intArray[i]=Integer.parseInt(scan.nextLine());
		}
		
	
		Arrays.sort(intArray);
		
		System.out.println("max num : "+intArray[intArray.length-1]);
		System.out.println("min num : "+intArray[0]);
	
	}

}
