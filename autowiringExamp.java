DemoApplication.java

package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		creating object manually
//		Hello h = new Hello();
//		h.greet();
		Hello h = context.getBean(Hello.class);
		h.greet();
	}
}

Hello.java
package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Component
public class Hello {
	@Autowired
	Laptop laptop;
	@RequestMapping("/")
	public String greet() {
		laptop.operate();
		return "hello Shreya,Welcome spring!";
	}
}

Laptop.java
package com.example.demo;
import org.springframework.stereotype.Component;
@Component
public class Laptop {
	public void operate() {
		System.out.println("laptop operates");
	}
}


