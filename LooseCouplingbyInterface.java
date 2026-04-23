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


package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Component
public class Hello {
//	@Autowired  // field injection
	@Autowired
	private Computer comp;
//	private Laptop laptop; 
	//	public Hello(Laptop laptop) { // constructor injection
//		this.laptop = laptop;
//	}
		// setter injection
//	@Autowired
//	public void setLaptop(Laptop laptop) { 
//		this.laptop = laptop;
//	}
		@RequestMapping("/")
	public String greet() {
		comp.operate();
		return "hello Shreya,Welcome spring!";
	}
}

package com.example.demo;
import org.springframework.stereotype.Component;
@Component
public class Laptop implements Computer {
	public void operate() {
		System.out.println("laptop operates");
	}
}

package com.example.demo;
public interface Computer {
	void operate();
}
