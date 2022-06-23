package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {

	// sending java object data as JSON data to client application
	@GetMapping("/report")
	public ResponseEntity<String> showCustData(@RequestBody Customer cust) {
		//Customer cust = new Customer(1001, "Raja", 87.99);
		// prepare ResponseEntity object having java object as response body and it will
		// automatically converted in json data while sending to client
		ResponseEntity<Customer> rs = new ResponseEntity<Customer>(cust, HttpStatus.OK);
		
System.out.println("==============================================================================");		
		
		Company comp = new Company("Vrnda", "Software", 32, "Vikrampuri");

//		Customer cust1 = new Customer(1001, "Raja", 87.99, new String[] { "red", "green", "black" },
//				List.of("10th", "12th", "BCS", "JAVA FullStack Developer"),
//				Set.of(7774969690L, 9146467451L, 7775828590L), Map.of("panID", 576515763, "adharId", 6756576), comp);
//		
		ResponseEntity<String> rs1 = new ResponseEntity<String>(cust.toString(), HttpStatus.OK);
		return rs1;
	}
}
