package com.example.HelloWorld;

import java.util.HashMap;

public class stringBuilderReverse extends DemoApplication {
	public static void main(String[] args) {
		String OrigStr = "hello str build"; 
		StringBuilder obj = new StringBuilder(OrigStr);
		obj.reverse();
		String RevStr = obj.toString();
		System.out.println("OrigStr: "+OrigStr);
		System.out.println("reverse Str: "+RevStr);
	}
}
