package com.calculator;

import javax.jws.*;

@WebService
public class fisrtClass {
	
	@WebMethod
	public int add (int num1, int num2 ){
		System.out.println("Muthukumaran");
		return num1 + num2;
	}
	
}
