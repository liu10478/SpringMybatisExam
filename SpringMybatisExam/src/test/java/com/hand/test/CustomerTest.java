package com.hand.test;

import java.util.Scanner;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hand.service.CustomerService;
import com.hand.service.impl.CustomerServiceImpl;

public class CustomerTest {
	
	@Autowired
	private CustomerService customerService;
	
	@Test
	public void testInsertCustomer(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入 FirstName(first_name):");
		String firstName = sc.next();
		System.out.println("请输入 LastName(last_name):");
		String lastName = sc.next();
		System.out.println("请输入 Email(email):");
		String email = sc.next();
		System.out.println("请输入 Address	ID:");
		Short addressId = (short)sc.nextInt();
		System.out.println("已经保存的数据如下：");
		customerService.saveCustomer(firstName, lastName, email, addressId);
	}
}
