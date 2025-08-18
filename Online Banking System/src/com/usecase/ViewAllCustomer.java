package com.usecase;

import java.util.List;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.exception.CustomerException;
import com.model.Customer;

public class ViewAllCustomer {

	public static void main(String[] args) {

		CustomerDao dao = new CustomerDaoImpl();

		try {
			List<Customer> customers = dao.viewAllCustomers();

			customers.forEach(s -> {
				System.out.println(s);
			});
		} catch (CustomerException e) {
			e.printStackTrace();
		}

	}

}
