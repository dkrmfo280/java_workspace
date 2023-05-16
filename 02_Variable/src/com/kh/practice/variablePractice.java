package com.kh.practice;

import java.util.Scanner;

public class variablePractice {
	
	// FQCN (Fully Qualified class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름 
	
public static void main(String[] args) {
	
	variablePractice vp = new variablePractice();
	vp.method1();
	vp.method2();
		

}
public void method1() {
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("첫 번째 정수를 입력하세요 : ");
	int Num1 = sc.nextInt();
	
	System.out.printf("두 번째 정수를 입력하세요 : ");
	int Num2 = sc.nextInt();

	System.out.printf("더하기 결과 : %d\n", Num1 + Num2, " 빼기 결과 : %d\n", Num1 - Num2, "곱하기 결과 : %d\n", Num1 * Num2,"나누기 결과 : %d\n", Num1 / Num2);

}

public void method2() {

	Scanner sc = new Scanner(System.in);
	
	System.out.printf("성인은 몇명인가요? : ");
	int Num1 = sc.nextInt();
	
	System.out.printf("청소년은 몇명인가요? : ");
	int Num2 = sc.nextInt();
	
		
}
}
