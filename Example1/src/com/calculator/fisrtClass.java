package com.calculator;

import javax.jws.*;

@WebService
public class fisrtClass {
	
	@WebMethod
	public int add (int num1, int num2 ){
		System.out.println("Muthukumaran 123 develop");
		return num1 + num2;
	}
	
}
