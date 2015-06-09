package com.jsr.tutorials.basic;

import java.util.ArrayList;
import java.util.List;

public class ContactProvider {
	private static int current = 0;
	
	public static List<Contact> createInitialModel() {
		ArrayList<Contact> list = new ArrayList<Contact>();
		list.add(createContact("Ann", "Anderson", "111-111-1111"));
		list.add(createContact("Max", "Martin", "777-777-7777"));
		list.add(createContact("Sue", "Summers", "888-888-8888"));
		list.add(createContact("John", "Jackson", "999-999-9999"));
		return list;
	}

	private static Contact createContact(String firstName, String lastName, String phone){
		return new Contact( current++, firstName, lastName, phone);
	}
}
