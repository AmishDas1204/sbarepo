package com.sba3.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sba3.model.Customer;
import com.sba3.service.CustomerService;

@RestController
@RequestMapping(value="/")
public class CustomerRestController {

	@Autowired
	private CustomerService custService;
	//adding mappings and defining the entities
	@GetMapping("/show")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		
		ResponseEntity<List<Customer>> resp = null;
		
		List<Customer> Customers = custService.getAllCustomers();
		
		if(Customers!=null)
			resp = new ResponseEntity<List<Customer>>(Customers, HttpStatus.OK);
		else
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		
		return resp;
	}
	
	@PostMapping("/create")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		
		ResponseEntity<Customer> resp = null;
		
		resp = new ResponseEntity<>(custService.addCustomer(customer), HttpStatus.OK);
		
		return resp;
		
	}
	
}
