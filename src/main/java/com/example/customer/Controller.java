package com.example.customer;

import java.util.List;
import java.util.LinkedList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping(path="/api")

public class Controller {

//		private final CustomerService customerservice;
	@Autowired(required = true)
	private CustomerRepository customerRepo;

	
	
	
	@PostMapping("/add")
	public Customer getCust(@RequestBody Customer customer) {
		
//		System.out.println(customer.get);
		Customer c=customerRepo.save(customer);
		return c;
	}
	
	@GetMapping("/get")
	public List<Customer> getDatas(){
		return customerRepo.findAll();
	}
//	
	
	
//	@RequestMapping(path="url/customer")
//	
//	public List<Customer> getData(){
//		
//	return customerservice.getData();	
//	}


}
