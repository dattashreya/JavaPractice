package com.example.ConditionalOperatorDemo;
public class HelloWorld extends ConditionalOperatorDemoApp {
	public static void main(String[] args) {
		int x=10;int y=11;int z=12;
		if(x > y & x > z) {
			System.out.println("decrease speed");
		} else
			System.out.println("increase speed");
	}
}
