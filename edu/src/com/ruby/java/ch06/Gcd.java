package com.ruby.java.ch06;

import java.util.Scanner;

public class Gcd {

	int num1; // 
	int num2; //변수 선언시 밑으로
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("A : ");
		int a = sc.nextInt();
		System.out.println("B : ");
		int b = sc.nextInt();
	
		Gcd gl = new Gcd();
		gl.num1 = a;
		gl.num2 = b;
		gl.print();
		
	}
	
	public void print() {
		//최소공배수와 최대공약수를 구한다. 유클리드 호제법
		//num1 : a , num2 : b
		
		int max, min;
		if(num1 < num2) { // num2 가 크면 max가 num2, min이 num1
			max = num2;
			min = num1;
		} else {
			max = num1;  // 또는 max가 num1, min이 num2
			min = num2;
		}
		int rem = max%min; // 
		while(rem != 0) { //rem이 0 이 아니면 max= min , min = rem
			max = min;
			min = rem;
//			rem = max%min; //rem이 0이 나올때까지 계속 반복
		}
			if(min == 1) {		
				System.out.println("최대공약수 : " + "서로소" ); // min 최대공약수가 1이면 서로소
			} else {
				System.out.println("최대공약수 : "+ min); //또는 min이 1이 아니면 최대공약수
				System.out.println("최소공배수 : " + (num1*num2)/min); //최소공배수는 (num1*num2)/min 
		}
		
	}

}
