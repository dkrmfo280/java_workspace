package com.kh.operator;

public class A_LogicalNegation {
	
	/*
	 * 논리 부정 연산자
	 * 
	 * [
	 * 
	 * *
	 */
   public static void main(String[] args) {
     boolean b1 = true ;
     boolean b2 = false;
     
     System.out.println("b1 :" + b1); // true
     System.out.println("b1의 부정 : " + !b1); // false
     System.out.println("b1 :" + b1); // true
     
     b1 = !b2;
     System.out.println("b1의 부정 : " + !!b1 ); // true
}
}