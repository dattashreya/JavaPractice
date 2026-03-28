package com.example.HelloWorld;

import java.util.HashMap;
public class hashmapdemo extends DemoApplication {

	public static void main(String[] args) {
		HashMap<String,Integer> obj = new HashMap<>();
		obj.put("Shreya", 10);
		obj.put("Shre", 20);
		obj.put("Shree", 30);
		obj.put("Shreyo", 40);
		System.out.println(obj);
	}

}
