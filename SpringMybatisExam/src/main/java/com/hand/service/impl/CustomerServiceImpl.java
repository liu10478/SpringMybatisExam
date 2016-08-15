package com.hand.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hand.dto.Customer;
import com.hand.mapper.CustomerMapper;
import com.hand.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper customerMapper;

	public void saveCustomer(String firstName,String lastName,String email,Short addressId) {
		Customer customer = new Customer();
		customer.setStoreId((byte)1);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setEmail(email);
		customer.setAddressId(addressId);
		customer.setCreateDate(new Date());
		customerMapper.insert(customer);
		System.out.println(customer);
	}
}
