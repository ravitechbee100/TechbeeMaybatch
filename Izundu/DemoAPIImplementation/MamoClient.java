package org.example;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MamoClient {
	
	ProductDAO productDAO = new ProductDAO();
	
	@GetMapping("/welcomemessage")
	public String welcomeMessage() {
		System.out.println(" Hello Techbeefolks");
		return "Hello Techbeefolks";
		
	}
	
	@GetMapping("/showallproducts")
	public ArrayList<ProductList> showproducts() {
		
		return productDAO.showallProducts();
	}
	
	@PostMapping("/addproduct")
	public ResponseEntity addproducts(@RequestBody ProductList product) {
		
	//write the code for this method.
		productDAO.addProduct(product);
		return ResponseEntity.ok(HttpStatus.OK);
		
	}
	
	
	
	
	

}
