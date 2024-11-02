package com.polyglot.appaccount.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/account")
public class AccountController {

	
	
	@GetMapping()
	public List<CustomerModel> get() {
		List<CustomerModel> customerList = new ArrayList<>();
        
        CustomerModel customer1 = new CustomerModel();
        customer1.setIdCustomer(1);
        customer1.setFullName("John Doe");
        customer1.setEmail("john.doe@example.com");

        CustomerModel customer2 = new CustomerModel();
        customer2.setIdCustomer(2);
        customer2.setFullName("Jane Smith");
        customer2.setEmail("jane.smith@example.com");

        CustomerModel customer3 = new CustomerModel();
        customer3.setIdCustomer(3);
        customer3.setFullName("Michael Johnson");
        customer3.setEmail("michael.johnson@example.com");

        // Agregar objetos a la lista
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        return customerList;
	}
}