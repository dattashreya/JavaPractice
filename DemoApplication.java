package com.example.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner obj = new Scanner(System.in);
		System.out.println("you name please?");
		String n = obj.nextLine();
		System.out.println("Name is-"+n);
	}
}
