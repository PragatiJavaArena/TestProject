package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {

	@GetMapping("/data")
	public ResponseEntity<Customer> showCustinXmlFormat() {
		Customer cust = new Customer(1001, "Ganesh", "nagar", 21.33f);
		// prepares Response entity object
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);

	}
}
