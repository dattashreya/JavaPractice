ProductController.java

package com.example.demo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController {
	@Autowired
	ProductService s;
	@RequestMapping("/products")
	public List<Product> getProducts() {
		return s.getProducts();
	}
}

ProductService.java

package com.example.demo;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.Product;
@Service
public class ProductService {
	List<Product> products = Arrays.asList(
			new Product(10,"Phone",1000),
			new Product(11,"TV",2000)
			);
public List<Product> getProducts() {
	return products;
	}
}

Product.java

package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int prodId;
	private String prodName;
	private int price;
	public Product() {
	}
	public Product(int prodId, String prodName, int price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
