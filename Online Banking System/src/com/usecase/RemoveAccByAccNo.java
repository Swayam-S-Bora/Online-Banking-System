package com.usecase;

import java.util.Scanner;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.exception.CustomerException;

public class RemoveAccByAccNo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("--------Enter Account Number--------");
		int acc = scanner.nextInt();

		CustomerDao dao = new CustomerDaoImpl();

		try {
			String result = dao.removeAccByAccNo(acc);

			System.out.println(result);
		} catch (CustomerException e) {
			e.printStackTrace();
		}
		scanner.close();
	}

}
