package com.usecase;

import java.util.Scanner;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.exception.CustomerException;

public class withdrawMoney {

	public static void main(String[] args) {

		System.out.println("........Enter Details.......");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter customer account number");
		int c_Acc_No = scanner.nextInt();

		System.out.println("Enter  name");
		String w_Name = scanner.next();

		System.out.println("Enter ammount");
		int w_Amount = scanner.nextInt();

		CustomerDao dao = new CustomerDaoImpl();
		scanner.close();
		try {
			String result = dao.withdrawMoney(c_Acc_No, w_Name, w_Amount);
			System.out.println(result);
		} catch (CustomerException e) {
			e.printStackTrace();
		}

	}

}
